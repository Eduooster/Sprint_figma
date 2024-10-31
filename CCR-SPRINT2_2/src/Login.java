import java.util.Objects;

public class Login{
    private String UserName;
    private String Senha;

    public Login() {
    }

    public Login(String userName, String senha) {
        UserName = userName;
        Senha = senha;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Login login = (Login) o;
        return Objects.equals(getUserName(), login.getUserName()) && Objects.equals(getSenha(), login.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getSenha());
    }

    @Override
    public String toString() {
        return "Login{" +
                "UserName='" + UserName + '\'' +
                ", Senha='" + Senha + '\'' +
                '}';
    }
}