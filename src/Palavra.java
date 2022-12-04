import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Palavra {

    private int id;
    private String letra;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavra palavra)) return false;
        return getId() == palavra.getId() && Objects.equals(getLetra(), palavra.getLetra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLetra());
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "id=" + id +
                ", letra='" + letra + '\'' +
                '}';
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
