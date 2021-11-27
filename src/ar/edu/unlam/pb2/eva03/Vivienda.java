package ar.edu.unlam.pb2.eva03;

public class Vivienda{

    private String dir;
    private String loc;
    private String muni;
    private String prov;

    public Vivienda(String dir, String loc, String muni, String prov) {
        this.dir = dir;
        this.loc = loc;
        this.muni = muni;
        this.prov = prov;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getMuni() {
        return muni;
    }

    public void setMuni(String muni) {
        this.muni = muni;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }
}
