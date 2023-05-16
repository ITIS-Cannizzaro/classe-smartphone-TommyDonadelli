

public class telefono {
    private String marca;
    private String modello;
    private double prezzoLancio;
    private double pollici;
    private int ram;
    private boolean touch;

    public telefono (String marca, String modello,double prezzoLancio, double pollici,int ram, boolean touch){
        this.marca=marca;
        this.modello=modello;
        this.prezzoLancio=prezzoLancio;
        this.pollici=pollici;
        this.ram=ram;
        this.touch=touch;
    }

    public telefono (){
        marca="Samsung";
        modello="s23";
        prezzoLancio=890.00;
        pollici=7.4;
        ram=8;
        touch=true;
    }

    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public double getPrezzoLancio(){
        return prezzoLancio;
    }
    public double getPollici(){
        return pollici;
    }
    public int getRam(){
        return ram;
    }
    public boolean getTouch(){
        return touch;
    }

    public String fasciaPrezzo(double vp){
        String ret1="";
        if(vp>500){ret1=("fascia alta");}
        if(vp<500&&vp>200){ret1=("fascia alta");}
        if(vp<200){ret1="fascia bassa";
    }
return ret1;}
    public String tipotelefono(double np){
        String ret2="";
        if(np<5){ret2="mini";}
        if(np<7&&np>5){ret2="normale";}
        if(np>7){ret2="maxi";}
        return ret2;
    }
    public void stampa(){

        System.out.println(marca);
        System.out.println(modello);
        System.out.println(prezzoLancio);
        System.out.println(pollici);
        System.out.println(ram);
        System.out.println(touch);
        
    }

    
}

