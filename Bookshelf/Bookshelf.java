
public class Bookshelf {
    int var1;
    int var2;

    Bookshelf(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    public int hashCode() {

        int result = 1;
        result = 31 * result + var1;
        result = 31 * result + var2;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bookshelf other = (Bookshelf) obj;
        if (var1 != other.var1)
            return false;
        if (var2 != other.var2)
            return false;
        return true;
    }





}