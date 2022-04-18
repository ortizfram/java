
package Entidates;

public class Rectangulo {
    
    private float base;
    private float altura;
    private float perimetro;
    private float superficie;
    private String dibujo;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura, float perimetro, float superficie, String dibujo) {
        this.base = base;
        this.altura = altura;
        this.perimetro = perimetro;
        this.superficie = superficie;
        this.dibujo = dibujo;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", superficie=" + superficie + ", dibujo=" + dibujo + '}';
    }
    
    
    
    
}
