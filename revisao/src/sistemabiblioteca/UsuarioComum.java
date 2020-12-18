package sistemabiblioteca;

import java.util.Date;

public class UsuarioComum extends Pessoa{
	
	private Date dataCadastro = new Date();
	private int idUsuario;
	
public UsuarioComum(Date nascimento, long cpf, String email, String login, String nome, String senha, String sobrenome, Date dataCadastro, int idUsuario) {
	super(nascimento,cpf,email,login,nome,senha,sobrenome);
	this.dataCadastro = dataCadastro;
	this.idUsuario = idUsuario;
}

public Date getDataCadastro() {
	return dataCadastro;
}

public void setDataCadastro(Date dataCadastro) {
	this.dataCadastro = dataCadastro;
}

public int getIdUsuario() {
	return idUsuario;
}

public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
}





}
