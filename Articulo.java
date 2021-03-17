package semana3;

public class Articulo implements Comparable<Articulo>
{
    private int cve_art;
    private String nom_art;
    private int cat_art;
    private int prov_art;
    private float pre_art;
    private int inv_art;

    public Articulo(int cve_art, String nom_art, int cat_art, int prov_art, float pre_art, int inv_art) {
        this.cve_art = cve_art;
        this.nom_art = nom_art;
        this.cat_art = cat_art;
        this.prov_art = prov_art;
        this.pre_art = pre_art;
        this.inv_art = inv_art;
    }

    public int getCve_art() {
        return cve_art;
    }

    public void setCve_art(int cve_art) {
        this.cve_art = cve_art;
    }

    public String getNom_art() {
        return nom_art;
    }

    public void setNom_art(String nom_art) {
        this.nom_art = nom_art;
    }

    public int getCat_art() {
        return cat_art;
    }

    public void setCat_art(int cat_art) {
        this.cat_art = cat_art;
    }

    public int getProv_art() {
        return prov_art;
    }

    public void setProv_art(int prov_art) {
        this.prov_art = prov_art;
    }

    public float getPre_art() {
        return pre_art;
    }

    public void setPre_art(float pre_art) {
        this.pre_art = pre_art;
    }

    public int getInv_art() {
        return inv_art;
    }

    public void setInv_art(int inv_art) {
        this.inv_art = inv_art;
    }

    @Override
    public String toString() {
        return  "cve_art=" + cve_art +
                ", nom_art='" + nom_art +
                ", cat_art=" + cat_art +
                ", prov_art=" + prov_art +
                ", pre_art=" + pre_art +
                ", inv_art=" + inv_art + '\n';
    }

    @Override
    public int compareTo(Articulo o) {
        if(o.getCve_art() > cve_art)
        {
            return -1;
        }
        else if(o.getCve_art() == cve_art)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
