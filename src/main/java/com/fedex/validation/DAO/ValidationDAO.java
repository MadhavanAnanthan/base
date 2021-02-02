package com.fedex.validation.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;

import com.fedex.framework.logging.FedExLogEntry;
import com.fedex.framework.logging.FedExLogger;
import com.fedex.framework.logging.FedExLoggerInterface;
import com.fedex.validation.IO.ValidationDetails;
import com.fedex.validation.connection.DBConfiguration;

@Configuration
public class ValidationDAO {

	DataSource source = DBConfiguration.getDataSource();
	JdbcTemplate jdbcTemplate = new JdbcTemplate(source);
	private static final FedExLoggerInterface LOGGER = FedExLogger.getLogger(ValidationDAO.class);

	public List<Map<String, String>> getParentTinsListForValidation(String tableName, String tin) {
		List<Map<String, String>> fieldMap = new ArrayList<Map<String, String>>();

		try {
			String query = "SELECT * FROM " + tableName + " where TEST_INPUT_NBR in (" + tin + ")";
			SqlRowSet rs = jdbcTemplate.queryForRowSet(query);

			SqlRowSetMetaData metaData = rs.getMetaData();

			LOGGER.info(new FedExLogEntry(
					"Total Column Count fetched for Parent TINS validation--->" + metaData.getColumnCount()));
			while (rs.next()) {

				Map<String, String> map = new HashMap<String, String>();
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
					String key = metaData.getColumnName(i);
					String value = rs.getString(key);
					map.put(key, value);
				}
				fieldMap.add(map);
			}
		} catch (Exception dbException) {
			dbException.printStackTrace();
			dbException.getMessage();
		}
		return fieldMap;
	}

	public List<Map<String, String>> getChildTinsListForValidation(String packageTable, String tin) {
		List<Map<String, String>> fieldMap = new ArrayList<Map<String, String>>();

		try {
			String query = "SELECT * FROM " + packageTable + " where TEST_INPUT_NBR in (" + tin + ")";
			SqlRowSet rs = jdbcTemplate.queryForRowSet(query);
			SqlRowSetMetaData meta = rs.getMetaData();

			LOGGER.info(new FedExLogEntry(
					"Total Column Count fetched for Child TINS validation--->" + meta.getColumnCount()));

			while (rs.next()) {

				Map<String, String> map = new HashMap<String, String>();
				for (int i = 1; i <= meta.getColumnCount(); i++) {
					String key = meta.getColumnName(i);
					String value = rs.getString(key);
					map.put(key, value);
				}
				fieldMap.add(map);
			}
		} catch (Exception dbException) {
			dbException.printStackTrace();
			dbException.getMessage();
		}
		return fieldMap;
	}

	public String insertValidationDetails(List<ValidationDetails> validationDetailsList) throws Exception {
		final int size = validationDetailsList.size();
		String query = "INSERT INTO RTM.BASELINE_VALIDATION_UTILITY (TEST_INPUT_NBR, SHP_SEQUENCE_NBR, SHP_SEQUENCE_QTY, VALIDATION_STATUS, VALIDATION_MESSAGE, WEBS_TRKNG_NBR, IGNORE_FLAG, "
				+ "IGNORE_REASON, IGNORE_COMMENTS, VALIDATED_BY, VALIDATED_TIMESTAMP, BASELINE_TBL_NAME) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		jdbcTemplate.batchUpdate(query, validationDetailsList, size,
				new ParameterizedPreparedStatementSetter<ValidationDetails>() {
					public void setValues(PreparedStatement ps, ValidationDetails valDetails) throws SQLException {
						ps.setString(1, valDetails.getTestInputNbr());
						ps.setString(2, valDetails.getShpSequenceNbr());
						ps.setString(3, valDetails.getShpSequenceQty());
						ps.setString(4, valDetails.getValidationStatus());
						ps.setString(5, valDetails.getValidationMessage());
						ps.setString(6, valDetails.getWebsTrkngNbr());
						ps.setString(7, valDetails.getIgnoreFlag());
						ps.setString(8, valDetails.getIgnoreReason());
						ps.setString(9, valDetails.getIgnoreComments());
						ps.setString(10, valDetails.getValidatedBy());
						java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
						ps.setTimestamp(11, sqlDate);
						ps.setString(12, valDetails.getBaselineTableName());
					}
				});
		return "";
	}

	public List<String> getAllTins(String tableName) {
		List<String> temptins = new ArrayList<String>();
		try {
			 String query = "";
			 // ------- Original Logic ------------
			 query = "SELECT TEST_INPUT_NBR FROM " + tableName + " where "
					+ "svctypcd not in ('17','18','82','84') and TEST_INPUT_NBR not in "
					+ "(select distinct TEST_INPUT_NBR from baseline_validation_utility)";
			 // ------- Original Logic ------------
			 
					 // and rownum<=100";
			 
			//----------  For Demo ----------------
			/*  switch (tableName) { case "TBL_DOM_TEST_DATA": { query =
			  "SELECT TEST_INPUT_NBR FROM " + tableName +
			  " where TEST_INPUT_NBR in ('2075','417420','125916','417419','125918','125919','125920','125921','125922','125923','125924')"
			  ; break; } case "TBL_INTL_TEST_DATA": { query =
			  "SELECT TEST_INPUT_NBR FROM " + tableName +
			  " where TEST_INPUT_NBR in ('79328','79329','82687','82688','442','79330','79331','444','445','439','434','242339','464')"
			  ; break; } case "TBL_DOM_GRD_TEST_DATA": { query =
			  "SELECT TEST_INPUT_NBR FROM " + tableName +
			  " where TEST_INPUT_NBR in ('131958','26445','26446','240554','240553','240552','43102','43103','43100','43097','43098','43099')"
			  ; break; } case "TBL_INTL_GRD_TEST_DATA": { query =
			  "SELECT TEST_INPUT_NBR FROM " + tableName +
			  " where TEST_INPUT_NBR in ('131844','238621','238622','52164','52161','52149','52152','21872','21873','21874','41706','41707')"
			 ; break; } }*/  
			// ----------  For Demo -----------------
			 
			//---------- Logic for Active flag as 'Y' ----------
			switch (tableName) 
			{ 
				case "TBL_DOM_TEST_DATA": 
			  { query = " select TEST_INPUT_NBR from TBL_DOM_TEST_DATA where cafeflg='Y' OR fxrsflg='Y' OR inetflg='Y' OR sgetflg='Y' OR wnrtflg='Y' OR websflg='Y' OR ssraflg='Y' OR posflg='Y' "+
					  	 	  " OR liteflg='Y' OR shpcflg='Y' OR ssfrflg='Y' OR sposflg='Y' ";
					  	break;
			  }
				case "TBL_INTL_TEST_DATA": 
				{ query =
					  " select TEST_INPUT_NBR from TBL_INTL_TEST_DATA where cafeflg='Y' OR fxrsflg='Y' OR inetflg='Y' OR sgetflg='Y' OR wnrtflg='Y' OR websflg='Y' OR ssraflg='Y' OR posflg='Y' "+
							  " OR liteflg='Y' OR shpcflg='Y' OR ssfrflg='Y' OR gsmwflg='Y' OR fastflg='Y' OR tntflg='Y' OR magsflg='Y' "; 
					  break;
					  } 
				case "TBL_DOM_GRD_TEST_DATA": 
				{ query =
					  " select TEST_INPUT_NBR from TBL_DOM_GRD_TEST_DATA where cafeflg='Y' OR fxrsflg='Y' OR inetflg='Y' OR sgetflg='Y' OR wnrtflg='Y' OR websflg='Y' OR ssraflg='Y' OR posflg='Y' "+
							  " OR liteflg='Y' OR shpcflg='Y' OR ssfrflg='Y' ";
					  break;
					  }
				case "TBL_INTL_GRD_TEST_DATA": 
				{ query =
					  " select TEST_INPUT_NBR from TBL_INTL_GRD_TEST_DATA where cafeflg='Y' OR fxrsflg='Y' OR inetflg='Y' OR sgetflg='Y' OR wnrtflg='Y' OR websflg='Y' OR ssraflg='Y' OR posflg='Y' "+
							  " OR liteflg='Y' OR shpcflg='Y' OR ssfrflg='Y' ";
					 break;
				}
			 }
			
			//---------- Ended Logic for Active flag as 'Y' ----------
			SqlRowSet rs = jdbcTemplate.queryForRowSet(query);

			while (rs.next()) {
				temptins.add(rs.getString("TEST_INPUT_NBR"));
			}
		} catch (Exception dbException) {
			dbException.printStackTrace();
			dbException.getMessage();
		}
		return temptins;
	}

	public Map<String, String> getMeterNumbers(String allTINS, String tableName) {
		Map<String, String> meterNbrs = new HashMap<String, String>();
		try {
			String query = "SELECT BL.TEST_INPUT_NBR, MN.METERNBR FROM " + tableName
					+ " BL LEFT JOIN METERNUMBERS MN ON bl.custnbr=mn.custnbr WHERE BL.TEST_INPUT_NBR in (" + allTINS
					+ ") AND MN.devicename ='WEBS'  and MN.LEVELOFTESTING='ITSB' and MN.NEW_VERSION_FLAG='N' ";
			SqlRowSet rs = jdbcTemplate.queryForRowSet(query);
			while (rs.next()) {
				meterNbrs.put(rs.getString("TEST_INPUT_NBR"), rs.getString("METERNBR"));
			}
		} catch (Exception dbException) {
			dbException.printStackTrace();
			dbException.getMessage();
		}
		return meterNbrs;
	}

}
