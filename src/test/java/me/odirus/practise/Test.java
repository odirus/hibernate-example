package me.odirus.practise;

import me.odirus.practise.Model.User;
import org.hibernate.Session;

import java.util.Date;

/**
 * User: huangjing
 * Email: huangjing@tinman.cn
 * Date: 2016/9/20
 * Time: 14:04
 */
public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();
		user.setUsername("Mukesh");
		user.setCreatedBy("Google");
		user.setCreatedDate(new Date());
		try {
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
