package com.artisan.redpacket.dao;

import org.springframework.stereotype.Repository;

import com.artisan.redpacket.pojo.UserRedPacket;

@Repository
public interface UserRedPacketDao {

	/**
	 * �����������Ϣ.
	 * @param userRedPacket �����������Ϣ
	 * @return Ӱ���¼��.
	 */
	public int grapRedPacket(UserRedPacket  userRedPacket);
}