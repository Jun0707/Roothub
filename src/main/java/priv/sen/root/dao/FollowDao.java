package priv.sen.root.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.sen.root.entity.Follow;
import priv.sen.root.entity.RootUser;

public interface FollowDao {

	/**
	 * 我关注的人
	 * @param start
	 * @param limit
	 * @param uid
	 * @return
	 */
	List<RootUser> select(@Param("start")Integer start,@Param("limit")Integer limit,@Param("uid")Integer uid);
	
	/**
	 * 关注我的人
	 * @param start
	 * @param limit
	 * @param uid
	 * @return
	 */
	List<RootUser> selectByFid(@Param("start")Integer start,@Param("limit")Integer limit,@Param("fid")Integer fid);
	
	/**
	 * 添加关注
	 * @param follow
	 * @return
	 */
	int insert(Follow follow);
	
	/**
	 * 取消关注
	 * @param uid
	 * @param fid
	 * @return
	 */
	int delete(@Param("uid")Integer uid,@Param("fid")Integer fid);
	
	/**
	 * 统计用户关注的数量
	 * @param uid
	 * @return
	 */
	int countByUid(@Param("uid")Integer uid);
	
	/**
	 * 统计用户被关注的数量
	 * @param fid
	 * @return
	 */
	int countByFid(@Param("fid")Integer fid);
	
	/**
	 * 判断是否已关注 0：否 1：是
	 * @param uid
	 * @param fid
	 * @return
	 */
	int isFollow(@Param("uid")Integer uid,@Param("fid")Integer fid);
}