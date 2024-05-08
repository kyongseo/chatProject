package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
    /**
     * 입력
     */
    //  public boolean addDept(int deptno, String dname, String loc) => DTO 생성해서 변환
    public boolean addDept(DeptDTO deptDTO) {

        // 매개변수로 받아옴 값이 너무 많음 -> 가방처럼 값을 담을 객체를 만들어서 사용함.
        // DTO, Model, Entity -> 데이터가 왔다갔다 사용되서..

        //1.필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;

        boolean resultFlag = false;

        try {
            //3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/exampledb";
            String user = "root1234";
            String password = "root1234";
            conn = DriverManager.getConnection(dbUrl, user, password);
            //4. 쿼리작성
            String sql = "insert into dept(deptno,dname,loc) values (?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setInt(1, deptDTO.getDeptno());
            ps.setString(2, deptDTO.getDeptname());
            ps.setString(3, deptDTO.getLoc());

            //5. 실행.
            int count = ps.executeUpdate(); // 1
            System.out.println(count + " insert!!");

            if (count > 0) {
                resultFlag = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //2. 닫아준다.
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return resultFlag;
    }

    /**
     * 수정
     */
    public int updateDept(DeptDTO deptDTO) {
        //1.필요한 객체를 선언한다.
        Connection conn = null;
        PreparedStatement ps = null;
        int resultCount = 0;

        try {
            //3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/exampledb";
            String user = "root1234";
            String password = "root1234";
            conn = DriverManager.getConnection(dbUrl, user, password);

            //4. 쿼리작성
            String sql = "update dept set dname=?, loc=? where deptno = ?";

            ps = conn.prepareStatement(sql);

            ps.setInt(3, deptDTO.getDeptno());
            ps.setString(1, deptDTO.getDeptname());
            ps.setString(2, deptDTO.getLoc());

            //5. 실행.
            resultCount = ps.executeUpdate(); // 1
            System.out.println(resultCount + " update!!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //2. 닫아준다.
//            if (ps != null) {
//                try {
//                    ps.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
        }
        return resultCount;
    }

    /**
     * 삭제
     */
    public void deleteDept(int deptno) {
    }

    /**
     * 한 건 조회
     */
    public DeptDTO getDept(int deptno) {
        //1. 필요한 객체 선언

        //3.  접속

        // 4. 쿼리 작성

        //5. 실행

        //6. 결과값 처리

        // 2. 닫는다
        return null;
    }

    /**
     * 모두 조회
     */
    public List<DeptDTO> getAllDepts() {
        return null;
    }




}
