package edu.swjtu.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import edu.swjtu.model.Admin;

/**
 * 
 * AdminDao.java
 * 2016 6 20 
 * @author wujunyu
 * TODo
 */
public interface AdminDao {
	/**
	 * 
	 * 2016 6 20  8:52:18
	 * @author wujunyu
	 * TODO 添加一个管理员
	 * @param admin
	 * @param con
	 * @return int
	 * @throws SQLException
	 */
	public int addAdmin(Admin admin,Connection con) throws SQLException;
	/**
	 * 
	 * 2016 6 20 8:53:12
	 * @author wujunyu
	 * TODO  根据adminId删除一个管理员
	 * @param id
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public int deleteAdmin(int adminId,Connection con) throws SQLException;
	/**
	 * 
	 * 2016年7月9日上午9:50:35
	 * @author wujunyu
	 * TODO 更新一个管理员
	 * @param admin
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public int updateAdmin(Admin admin,Connection con) throws SQLException;
	/**
	 * 
	 * 2016年7月9日上午9:51:07
	 * @author wujunyu
	 * TODO 根据adminID查询一个管理员
	 * @param adminId
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public Admin getAdminById(int adminId,Connection con) throws SQLException;
	/**
	 * 根据角色名称查询角色
	 * 2016年7月10日上午11:26:18
	 * @author jimolonely
	 * @param name
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public Admin getAdminByName(String name,Connection con)throws SQLException;
	/**
	 * 
	 * 2016年7月9日上午9:51:50
	 * @author wujunyu
	 * TODO 得到所有管理员角色
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Admin> getAllAdmin(Connection con) throws SQLException;
	/**
	 * 分页查询：从startPage开始查询pageNum这么多数据
	 * 2016年7月13日下午12:51:21
	 * @author jimolonely
	 * @param con
	 * @param startPage
	 * @param pageNum
	 * @return
	 * @throws SQLException 
	 */
	public ArrayList<Admin> getPageAdmin(Connection con,int startPage,int pageNum) throws SQLException;
	/**
	 * 取得总数据量
	 * 2016年7月13日下午1:31:08
	 * @author jimolonely
	 * @param con
	 * @return
	 * @throws SQLException 
	 */
	public int getTotal(Connection con) throws SQLException;
}
