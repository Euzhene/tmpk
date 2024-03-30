package com.makuku.tmpk;

import com.makuku.tmpk.config.JdbcConfig;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class TestRepository {

    public void getById(int id) {
        String query = "SELECT a.RDB$RELATION_NAME " +
                "FROM RDB$RELATIONS a " +
                "WHERE COALESCE(RDB$SYSTEM_FLAG, 0) = 0 AND RDB$RELATION_TYPE = 0";


        Connection con = JdbcConfig.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
               Object ojb = rs.getObject(1);
                TmpkApplication.logger.error("hey" + ojb);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
