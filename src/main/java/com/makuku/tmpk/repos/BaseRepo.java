package com.makuku.tmpk.repos;

import com.makuku.tmpk.TmpkApplication;
import com.makuku.tmpk.config.JdbcConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseRepo {
    protected <T> List<T> getObjects(String query, Class<T> clazz) {
        List<T> objectModelList = new ArrayList<>();

        Connection con = JdbcConfig.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ResultSetMetaData tableMetaData = rs.getMetaData();
            int columnLength = tableMetaData.getColumnCount();

            while (rs.next()) {
                Map<String, Object> json = new HashMap<>();
                for (int i = 1; i <= columnLength; i++) {
                    json.put(tableMetaData.getColumnName(i).toLowerCase(), rs.getObject(i));
                }
                T objectModel = TmpkApplication.objectMapper.convertValue(json, clazz);
                objectModelList.add(objectModel);
            }
        } catch (SQLException e) {
            TmpkApplication.logger.error(e);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                TmpkApplication.logger.error(e);
            }
        }
        TmpkApplication.logger.info("Found " + objectModelList.size() + " objects");
        return objectModelList;
    }
}
