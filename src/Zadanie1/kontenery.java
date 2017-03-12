package Zadanie1;

/**
 * Created by Łukasz on 06.03.2017.
 */
public class kontenery implements Comparable<kontenery>{
    public Integer a,b,suma;
    kontenery(Integer a,Integer b){
        this.a=a;
        this.b=b;
        this.suma=this.a+this.b;
    }

    @Override
    public int compareTo(kontenery o) {
        int roznica= suma.compareTo(o.suma);
        return roznica;
    }
}
