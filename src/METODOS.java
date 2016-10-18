import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class METODOS {
    CRIP_IMG IMG=new CRIP_IMG();
    int a=256,b;
    public String TXT,CR="",CR2="",NAME="",contenido="",encoded,decoded,HASHM,HASHS,DATALEIDA="";
    boolean read=false,abrirf=false,abriri=false,FKEY=false,CRIP=false,DCRIP=false;
    double A,K,X0,R1=0.0,G=18.0,M;
    public int Random(){
        if(a==256){
            a=hash(false);
            b=hash(true);
            K=b;
            X0=((a&2)==0)?a+3:a;
            A=5+(8*K);
            M=Math.pow(2, G);
        }
        X0=(X0*A)%M;
        R1=((X0/(M-1))*256);
        return (int)R1;
    }
    public static int hash(boolean T){
        double RESUL=0.0;
        if(T){
            for(int x=0;x<CRIPEX16.jTextField5.getText().length();x++){
                RESUL=((Math.pow(CRIPEX16.jTextField5.getText().charAt(x),2)+256+x+RESUL)%(256+x))/(256+x);
            }
        }else{
            for(int x=0;x<CRIPEX16.jTextField3.getText().length();x++){
                RESUL=((Math.pow(CRIPEX16.jTextField3.getText().charAt(x),2)+256+x+RESUL)%(256+x))/(256+x);
            }
        }
        RESUL=RESUL*1000000;
        return (int)(RESUL);
    }
    public void img(ArrayList<Integer>VAL) throws IOException{
        String A1="",A2="",A3="",val;
        int DD=(int)Math.sqrt((VAL.size()/3)+1)+1;
        int N1,N2,N3,LE;
        LE=VAL.size();
        if(LE<=255){
            N1=LE;
            A1=Integer.toHexString(N1);
        }else if(LE>255||LE<65535){
            N2=LE/256;
            A2=Integer.toHexString(N2);
            N1=LE-(N2*256);
            A1=Integer.toHexString(N1);
        }else if(LE>65535){;
            N3=LE/65536;
            A3=Integer.toHexString(N3);
            N2=(LE-(N3*65536))/256;
            A2=Integer.toHexString(N2);
            N1=LE-(N3*65536)-(N2*256);
            A1=Integer.toHexString(N1);
        }
        DD++;
        BufferedImage image = new BufferedImage(DD, DD, BufferedImage.TYPE_INT_RGB);
        val=A3+A2+A1;
        int s=Integer.valueOf(val, 16);
        image.setRGB(0, 0, s);
        int f=0,Ran=0;
        for(int y=0;y<DD;y++)
            for(int x=0;x<DD;x++){
                if(x==0&&y==0)
                    x=1;
                f+=3;
                if(true){
                    if(f<LE+3){
                        if(VAL.get(f-3)<16)
                            A1="0"+Integer.toHexString(VAL.get(f-3));
                        else
                            A1=Integer.toHexString(VAL.get(f-3));
                    }
                    else{
                        Ran=(int)(Math.random()*255);
                        A1=Integer.toHexString(Ran);
                    }
                    if(f<LE+2){
                        if(VAL.get(f-2)<16)
                            A2="0"+Integer.toHexString(VAL.get(f-2));
                        else
                            A2=Integer.toHexString(VAL.get(f-2));
                    }
                    else{
                        Ran=(int)(Math.random()*255);
                        A2=Integer.toHexString(Ran);
                    }
                    if(f<LE+1){
                        if(VAL.get(f-1)<16)
                            A3="0"+Integer.toHexString(VAL.get(f-1));
                        else
                            A3=Integer.toHexString(VAL.get(f-1));
                    }
                    else{
                        Ran=(int)(Math.random()*255);
                        A3=Integer.toHexString(Ran);
                    }
                    val=A1+A2+A3;
                    s=Integer.valueOf(val,16);
                    image.setRGB(x, y, s);
                } 
            }
        File file = new File(NAME+".PNG");
        ImageIO.write(image, "png", file);
    }
}
