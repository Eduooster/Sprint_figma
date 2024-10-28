import java.util.Objects;

public class Login {
    private String userName;
    private String senha;

    public Login() {
    }

    public Login(String userName, String senha) {
        this.userName = userName;
        this.senha = senha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return Objects.equals(getUserName(), login.getUserName()) && Objects.equals(getSenha(), login.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getSenha());
    }


}
