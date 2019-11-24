package br.edu.ifsp.scl.recyclerviewsdmtrabalho2;

public class CartaoPostal {

    private int id;
    private String nome;
    private String local;
    private String pais;
    private int image;

    public CartaoPostal(int id, String nome, String local, String pais, int image) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.pais = pais;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
