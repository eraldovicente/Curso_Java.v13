package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Fabiana"));
		System.out.println(dao.incluir(sql, "Gabriel"));
		System.out.println(dao.incluir(sql, "Edna"));
		System.out.println(dao.incluir(sql, "Bárbara"));
		System.out.println(dao.incluir(sql, "Eduardo"));
		
		dao.close();
	}
}
