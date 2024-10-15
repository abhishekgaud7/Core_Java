package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_ASSIGNMENT {

    public static void main(String[] args) {
        Connection cn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/JDBC_ASSIGNMENT", "root", "root");
            stmt = cn.createStatement();

           
            String select = "SELECT DISTINCT job FROM emp";
            rs = stmt.executeQuery(select);
            while (rs.next()) {
                System.out.println(rs.getString("job"));
            }

           
            String query2 = "SELECT * FROM emp ORDER BY dept_no ASC, job DESC";
            rs = stmt.executeQuery(query2);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", Job: " + rs.getString("job") + ", dept_no: " + rs.getInt("dept_no"));
            }

           
            String query3 = "SELECT DISTINCT job FROM emp ORDER BY job DESC";
            rs = stmt.executeQuery(query3);
            while (rs.next()) {
                System.out.println(rs.getString("job"));
            }

            
            String query4 = "SELECT * FROM emp WHERE hire_date < '1981-01-01'";
            rs = stmt.executeQuery(query4);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", hire_date: " + rs.getDate("hire_date"));
            }

          
            String query5 = "SELECT emp_no, emp_name, salary, salary / 30 AS daily_salary FROM emp ORDER BY salary * 12 ASC";
            rs = stmt.executeQuery(query5);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", salary: " + rs.getDouble("salary") + ", Daily salary: " + rs.getDouble("daily_salary"));
            }

            
            String query6 = "SELECT emp_no, emp_name, salary, comm FROM emp WHERE mgr = 7369";
            rs = stmt.executeQuery(query6);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", salary: " + rs.getDouble("salary") + ", comm: " + rs.getInt("comm"));
            }

          
            String query7 = "SELECT * FROM emp WHERE comm > salary";
            rs = stmt.executeQuery(query7);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", salary: " + rs.getDouble("salary") + ", Comm: " + rs.getDouble("comm"));
            }

            
            String query8 = "SELECT * FROM emp WHERE job IN ('CLERK', 'ANALYST') ORDER BY job DESC";
            rs = stmt.executeQuery(query8);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", Job: " + rs.getString("job"));
            }

            
            String query9 = "SELECT * FROM emp WHERE salary * 12 BETWEEN 22000 AND 45000";
            rs = stmt.executeQuery(query9);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", salary: " + rs.getDouble("salary"));
            }

          
            String query10 = "SELECT emp_name FROM emp WHERE emp_name LIKE 'S____'";
            rs = stmt.executeQuery(query10);
            while (rs.next()) {
                System.out.println(rs.getString("emp_name"));
            }

          
            String query11 = "SELECT * FROM emp WHERE emp_no NOT LIKE '78%'";
            rs = stmt.executeQuery(query11);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no"));
            }

           
            String query12 = "SELECT * FROM emp WHERE job = 'CLERK' AND dept_no = 20";
            rs = stmt.executeQuery(query12);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name"));
            }

        
            String query13 = "SELECT e1.* FROM emp e1 JOIN emp e2 ON e1.mgr = e2.emp_no WHERE e1.hire_date < e2.hire_date";
            rs = stmt.executeQuery(query13);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name"));
            }

            
            String query14 = "SELECT * FROM emp WHERE dept_no = 20 AND job IN (SELECT DISTINCT job FROM emp WHERE dept_no = 10)";
            rs = stmt.executeQuery(query14);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", Job: " + rs.getString("job"));
            }

            
            String query15 = "SELECT * FROM emp WHERE salary IN (SELECT salary FROM emp WHERE emp_name IN ('FORD', 'SMITH')) ORDER BY salary DESC";
            rs = stmt.executeQuery(query15);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", salary: " + rs.getDouble("salary"));
            }

           
            String query16 = "SELECT * FROM emp WHERE job IN (SELECT job FROM emp WHERE emp_name IN ('SMITH', 'ALLEN'))";
            rs = stmt.executeQuery(query16);
            while (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", Job: " + rs.getString("job"));
            }

           
            String query17 = "SELECT DISTINCT job FROM emp WHERE dept_no = 10 AND job NOT IN (SELECT DISTINCT job FROM emp WHERE dept_no = 20)";
            rs = stmt.executeQuery(query17);
            while (rs.next()) {
                System.out.println(rs.getString("job"));
            }

            // 18. Find the highest salaryary in the EMP table
            String query18 = "SELECT MAX(salary) AS highest_salaryary FROM emp";
            rs = stmt.executeQuery(query18);
            if (rs.next()) {
                System.out.println("Highest salaryary: " + rs.getDouble("highest_salaryary"));
            }

          
            String query19 = "SELECT * FROM emp WHERE salary = (SELECT MAX(salary) FROM emp)";
            rs = stmt.executeQuery(query19);
            if (rs.next()) {
                System.out.println("emp_no: " + rs.getInt("emp_no") + ", emp_name: " + rs.getString("emp_name") +
                        ", salary: " + rs.getDouble("salary"));
            }

           
            String query20 = "SELECT SUM(salary) AS total_salaryary_mgrs FROM emp WHERE emp_no IN (SELECT DISTINCT mgr FROM emp)";
            rs = stmt.executeQuery(query20);
            if (rs.next()) {
                System.out.println("Total salaryary Given to MGRs: " + rs.getDouble("total_salaryary_mgrs"));
            }
        
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver class not found.");
        } catch (SQLException e) {
            
        } 
        
        }
    }
