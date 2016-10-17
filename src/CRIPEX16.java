import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
public class CRIPEX16 extends javax.swing.JFrame implements Runnable{
Thread h1;
int a=256,b;
public String TXT,CR="",CR2="",NAME="",contenido="",encoded,decoded,HASHM,HASHS,DATALEIDA="";
boolean read=false,abrirf=false,abriri=false,FKEY=false,CRIP=false,DCRIP=false;
double A,K,X0,R1=0.0,G=18.0,M;
    public CRIPEX16() {
        initComponents();
    }
    public void run(){
        Thread ct = Thread.currentThread();
        if(CRIP){
            try {
                Crip();
            } catch (IOException ex) {
                Logger.getLogger(CRIPEX16.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(read){
            Read();
        }else if(abrirf){
            try {
                AbrirF();
            } catch (IOException ex) {
                Logger.getLogger(CRIPEX16.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(DCRIP){
            Dcrip();
        }else if(abriri){
            try {
                Abriri();
            } catch (IOException ex) {
                Logger.getLogger(CRIPEX16.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        a=256;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        HASH_GENERADO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Random_Key = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        Crip = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        D_Crip = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setEditable(false);
        jTextField1.setToolTipText("Ruta del Archivo o Imagen");

        HASH_GENERADO.setEditable(false);
        HASH_GENERADO.setToolTipText("HASH del archivo o imagen en MD5 o SHA1");

        jLabel1.setText("HASH MD5");

        jTextField3.setToolTipText("Contraceña para la encriptacion");

        Random_Key.setText("R.KEY");
        Random_Key.setToolTipText("Se crea una contraceña con una longitud especifica");
        Random_Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Random_KeyActionPerformed(evt);
            }
        });

        jTextField4.setToolTipText("Contraceña aleatoria");

        Crip.setText("CRIP");
        Crip.setToolTipText("Encriptar Texto");
        Crip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CripActionPerformed(evt);
            }
        });

        jTextField5.setToolTipText("Nombre del archivo o imagen");

        D_Crip.setText("D.CRIP");
        D_Crip.setToolTipText("Desencriptar texto");
        D_Crip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_CripActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setFocusable(false);

        jTextField7.setEditable(false);
        jTextField7.setFocusable(false);

        jTextField8.setEditable(false);
        jTextField8.setFocusable(false);

        jButton7.setText("CLR");
        jButton7.setToolTipText("Limpiar campos");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("IMG");
        jRadioButton1.setToolTipText("Se creara una imagen a partir del texto");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FILE");
        jRadioButton2.setToolTipText("Se creara un archivo a partir del texto");

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("HASH");
        jCheckBox1.setToolTipText("Habilirar o desabilitar la creacion o lectura de HASH");
        jCheckBox1.setEnabled(false);
        jCheckBox1.setFocusable(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("MD5");
        jRadioButton5.setFocusable(false);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("SHA1");
        jRadioButton6.setFocusable(false);
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("LISTO");
        jLabel3.setToolTipText("");

        jCheckBox2.setText("Verificar Integridad");
        jCheckBox2.setToolTipText("Verifica si el archivo fue modificado");
        jCheckBox2.setEnabled(false);

        jLabel4.setText("Nombre del archivo");

        jLabel5.setText("Contraceña");

        jLabel6.setText("Formato de salida");

        jMenu2.setText("Archivo");

        jMenu1.setText("Texto");

        jMenuItem6.setText("Abrir archivo TXT");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Abrir archivo X16KEY");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem3.setText("Abrir imagen PNG");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu2.add(jMenu1);

        jMenuItem4.setText("Imagenes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Archivos binarios");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("HASH");

        jMenu5.setText("Generar HASH de archivos");

        jMenuItem8.setText("MD5");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("SHA1");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenu4.add(jMenu5);

        jMenuItem10.setText("HASH de texto");
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");

        jMenuItem11.setText("Configuracion");
        jMenu3.add(jMenuItem11);

        jMenuItem1.setText("Manual");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Acerca de");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Crip, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5)
                        .addGap(18, 18, 18)
                        .addComponent(D_Crip)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton6)
                        .addGap(91, 91, 91)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Random_Key)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HASH_GENERADO, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1)
                        .addComponent(jRadioButton5)
                        .addComponent(jRadioButton6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HASH_GENERADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Random_Key)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Crip)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton1)
                        .addComponent(jLabel6)
                        .addComponent(D_Crip)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    JFileChooser abrirArchivo;
    public String MD5(){
        return "";
    }
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
    public int hash(boolean T){
        double RESUL=0.0;
        if(T){
            for(int x=0;x<jTextField5.getText().length();x++){
                RESUL=((Math.pow(jTextField5.getText().charAt(x),2)+256+x+RESUL)%(256+x))/(256+x);
            }
        }else{
            for(int x=0;x<jTextField3.getText().length();x++){
                RESUL=((Math.pow(jTextField3.getText().charAt(x),2)+256+x+RESUL)%(256+x))/(256+x);
            }
        }
        RESUL=RESUL*1000000;
        return (int)(RESUL);
    }
    public void Abriri() throws IOException{
        DATALEIDA="";
        jLabel3.setText("ABRIENDO IMAGEN");
        jLabel3.setForeground(Color.YELLOW);
        jTextArea1.setText("");
        contenido="";
        abriri=false;
        abrirArchivo = new JFileChooser();
        abrirArchivo.setDialogTitle("Seleccionar Imagen");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("PNG","png");
        abrirArchivo.setFileFilter(filtroImagen);
        String path="";
        int n=0,DATO;
        BufferedImage PNG=null;
        abrirArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int seleccion = abrirArchivo.showOpenDialog( this );
        if( seleccion == JFileChooser.APPROVE_OPTION ){
            File f = abrirArchivo.getSelectedFile();
            try{
                path = f.getAbsolutePath();
                String name=f.getName();
                jTextField5.setText(name.substring(0, name.length()-4));
                PNG=ImageIO.read(f);
            }catch( Exception exp){}
        }
        jTextField1.setText(path);
        String HX,D="";
        try{
        n=PNG.getTileWidth();
        HX="";
        int Tam=0,z=0;
        DATO=PNG.getRGB(0, 0);
        HX=Integer.toHexString(DATO);
        Tam=Integer.parseInt(HX.substring(2, 8),16)/3;
        int T=Integer.parseInt(HX.substring(2, 8),16),TF;
        int HASHINT[]=new int[T];
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                if(z==Tam+1)
                    break;
                if(x==0&&y==0)
                    y=1;
                DATO=PNG.getRGB(y, x);
                
                HX=Integer.toHexString(DATO);
                
                D=D+HX.substring(2, 8).toUpperCase();
                z++;
            }
            if(z==Tam+1)
                break;
        }
        if(D.length()-6==T*2){
            TF=6;
        }else if(D.length()-4==T*2){
            TF=4;
        }else{
            TF=2;
        }
        D=D.substring(0, D.length()-TF);
        if(jCheckBox1.isSelected())
            if(jRadioButton5.isSelected())
                HASH(HX,"MD5");
            else
                HASH(HX,"SHA1");
        DATALEIDA=D;
            System.err.println(DATALEIDA);
        }catch(Exception e){}
        jLabel3.setText("LISTO");
        jLabel3.setForeground(Color.GREEN);
    }
    public void file(int VAL) throws IOException{
        File FW=new File(NAME+".x16key");
        try (BufferedOutputStream BW = new BufferedOutputStream(new FileOutputStream(FW,true))) {
            BW.write(VAL);
        }
    }
    public void KEY() throws IOException{
        File FW=new File(NAME+".x16key");
        try (BufferedOutputStream BW = new BufferedOutputStream(new FileOutputStream(FW,true))) {
            for(int x=0;x<16;x++)
                BW.write(x);
        }
    }
    public void img(int []VAL) throws IOException{
        String A1="",A2="",A3="",val;
        int DD=(int)Math.sqrt((VAL.length/3)+1)+1;
        int N1,N2,N3,LE;
        LE=VAL.length;
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
                        if(VAL[f-3]<16)
                            A1="0"+Integer.toHexString(VAL[f-3]);
                        else
                            A1=Integer.toHexString(VAL[f-3]);
                    }
                    else{
                        Ran=(int)(Math.random()*255);
                        A1=Integer.toHexString(Ran);
                    }
                    if(f<LE+2){
                        if(VAL[f-2]<16)
                            A2="0"+Integer.toHexString(VAL[f-2]);
                        else
                            A2=Integer.toHexString(VAL[f-2]);
                    }
                    else{
                        Ran=(int)(Math.random()*255);
                        A2=Integer.toHexString(Ran);
                    }
                    if(f<LE+1){
                        if(VAL[f-1]<16)
                            A3="0"+Integer.toHexString(VAL[f-1]);
                        else
                            A3=Integer.toHexString(VAL[f-1]);
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
    public void HASH(String Hash,String Modo) throws IOException{
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance(Modo);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CRIPEX16.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.reset();
        m.update(Hash.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
        while(hashtext.length() < 32 ){
            hashtext = "0"+hashtext;
        }
        HASH_GENERADO.setText(hashtext.toUpperCase());
        HASHM=HASH_GENERADO.getText();
        if(HASH_GENERADO.getText().equals("C4CA4238A0B923820DCC509A6F75849B")||HASH_GENERADO.getText().equals("D41D8CD98F00B204E9800998ECF8427E")){
            HASH_GENERADO.setText("");
            jTextField8.setText("0");
            HASHM="";
        }
    }
    public int DatoHex(int Dato,int DatoRandom,int DatoAterior){
        int temp=Dato+DatoRandom+DatoAterior;
        if(temp>=256){
            temp=temp-256;
            if(temp>=256){
                return temp-256;
            }else{
                return temp;
            }
        }else{
            return temp;
        }
    }
    public int DatoHexDec(int Dato,int DatoRandom,int DatoAnterior){
        int temp=Dato-DatoRandom-DatoAnterior;
        if(temp<=0){
            temp=temp+256;
            if(temp<=0){
                return temp+256;
            }else{
                return temp;
            }
        }else{
            return temp;
        }
    }
    public void Crip() throws IOException{
        CRIP=false;
        File EXISTE=new File(jTextField5.getText()+((jRadioButton1.isSelected())?".png":".x16key"));
        int Band=0;
        if(EXISTE.exists()){
            Band=JOptionPane.showConfirmDialog(null, "El archivo con el nombre: "+jTextField5.getText()+((jRadioButton1.isSelected())?".png":".x16key")+", ya existe\n¿Desea remplazarlo?", "Archivo existente", 0 , 0);
            if(Band==0){
                EXISTE.delete();
            }
        }if(Band==0){
        jLabel3.setText("ENCRIPTANDO");
        jLabel3.setForeground(Color.YELLOW);
        if(jTextField5.getText().length()==0){
            NAME="KEY";
        }else
            NAME=jTextField5.getText();
        int CRY,VAL=0,DDR;
        String GG=jTextArea1.getText();
        int[]HASHINT=new int[jTextArea1.getText().length()];
        for(int x=0;x<jTextArea1.getText().length();x++){
            CRY=GG.charAt(x);
            DDR=Random();
            VAL=DatoHex(CRY,DDR,VAL);
            if(jRadioButton2.isSelected()){
                file(VAL);
            }
            HASHINT[x]=VAL;
        }
        if(jRadioButton1.isSelected())
            img(HASHINT);
        jTextField7.setText(String.valueOf(jTextArea1.getText().length()));
        jTextField8.setText(String.valueOf(HASHINT.length));
        
        if(jTextArea1.getText().length()==HASHINT.length){
            jLabel2.setForeground(Color.green);
            jLabel2.setText("TRUE");
        }
        else{
            jLabel2.setForeground(Color.red);
            jLabel2.setText("FALSE");
        }
        if(jCheckBox1.isSelected())
            if(jRadioButton5.isSelected())
                HASH(Arrays.toString(HASHINT),"MD5");
            else
                HASH(Arrays.toString(HASHINT),"SHA1");
        String ff=HASH_GENERADO.getText();
        HASH_GENERADO.setText(ff);
        jLabel3.setText("LISTO");
        jLabel3.setForeground(Color.GREEN);
        }
    }
    public void Read(){
        read=false;
        jLabel3.setText("LEYENDO");
        jLabel3.setForeground(Color.YELLOW);
        abrirArchivo = new JFileChooser();
        FileInputStream fis;
        DataInputStream entrada;
        String path="";
        abrirArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int seleccion = abrirArchivo.showOpenDialog( this );
        if( seleccion == JFileChooser.APPROVE_OPTION ){
            File f = abrirArchivo.getSelectedFile();
            try{
                path = f.getAbsolutePath();
            }catch( Exception exp){}
        }
        try {
            fis = new FileInputStream(path);
            entrada = new DataInputStream(fis);
            while( ( TXT = entrada.readLine()) != null ){
                jTextArea1.setText(jTextArea1.getText().concat(TXT+"\n"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        jLabel3.setText("LISTO");
        jLabel3.setForeground(Color.GREEN);
    }
    public void AbrirF() throws IOException{
        DATALEIDA="";
        jLabel3.setText("ABRIRENDO ARCHIVO");
        jLabel3.setForeground(Color.YELLOW);
        abrirf=false;
        contenido="";
        jTextArea1.setText("");
        abrirArchivo = new JFileChooser();
        abrirArchivo.setDialogTitle("Seleccionar Archivo");
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("X16KEY","x16key");
        abrirArchivo.setFileFilter(filtroImagen);
        FileInputStream fis;
        DataInputStream entrada;
        String path="",name="";
        abrirArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );
        long s=0;
        double temp;
        int seleccion = abrirArchivo.showOpenDialog( this );
        if( seleccion == JFileChooser.APPROVE_OPTION ){
            File f = abrirArchivo.getSelectedFile();
            try{
                path = f.getAbsolutePath();
                name=f.getName();
                s=f.length();
                name=name.substring(0, name.length()-7);
            }catch( Exception exp){}
        }
        int HASHINT[]=new int[65500];
        try {
            fis = new FileInputStream(path);
            entrada = new DataInputStream(fis);
            jTextField1.setText(path);
            int Dat;
            long x=0,T=s/1000,F=0;
            StringBuilder SW_Datos_Leidos;
            SW_Datos_Leidos=new StringBuilder(50000);
            jProgressBar1.setMaximum(1000);
            while( ( Dat = entrada.read()) != -1){
                if(jCheckBox1.isSelected()&&x<49999)
                    HASHINT[(int)x]=Dat;
                x++;
                if(s>=1000){
                    F=(x%T==0)?F+1:F;
                    jProgressBar1.setValue((int)F);
                }
                //System.err.println(F+" "+x);
                
                if(Dat<16){
                    SW_Datos_Leidos=SW_Datos_Leidos.append(("0"+Integer.toHexString(Dat)).toUpperCase());
                    if(x%49999==0){
                        DATALEIDA=DATALEIDA+(SW_Datos_Leidos.toString());
                        SW_Datos_Leidos.delete(0, 49999);
                    }
                }
                else{
                    SW_Datos_Leidos=SW_Datos_Leidos.append((Integer.toHexString(Dat)).toUpperCase());
                    if(x%49999==0){
                        DATALEIDA=DATALEIDA+(SW_Datos_Leidos.toString());
                        SW_Datos_Leidos.delete(0, 49999);
                    }
                }
            }
            if(s%49999>0)
                DATALEIDA=DATALEIDA+(SW_Datos_Leidos.toString());
            entrada.close();
//            if(Dat<16)
//                DATALEIDA=DATALEIDA+(("0"+Integer.toHexString(Dat)).toUpperCase());
//            else
//                DATALEIDA=DATALEIDA+((Integer.toHexString(Dat)).toUpperCase());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        if(jCheckBox1.isSelected())
            if(jRadioButton5.isSelected())
                HASH(Arrays.toString(HASHINT),"MD5");
            else
                HASH(Arrays.toString(HASHINT),"SHA1");
        jLabel3.setText("LISTO");
        jLabel3.setForeground(Color.GREEN);
        jTextField5.setText(name);
    }
    public void Dcrip(){
        DCRIP=false;
        jLabel3.setText("DESENCRIPTANDO");
        jLabel3.setForeground(Color.YELLOW);
        if(DATALEIDA.length()==0)
            JOptionPane.showMessageDialog(rootPane, "No hay datos", "Error", 0);
        else{
            jTextArea1.setText("");
            int DDR=0,G1=0,G2;
            jTextField7.setText(String.valueOf(jTextArea1.getText().length()));
            int CRY,VAL=0,TEMP=0;
            G1=0;
            G2=2;
            StringBuilder SB=new StringBuilder(50000);
            for(int x=0;x<(DATALEIDA.length()/2);x++){
                CRY=Integer.parseInt(DATALEIDA.substring(G1, G2),16);
                DDR=Random();
                VAL=DatoHexDec(CRY, DDR, TEMP);
                TEMP=CRY;
                G1+=2;
                G2+=2;
                SB.append(String.valueOf((char)VAL));
                if(x%49999==0){
                    jTextArea1.setText(jTextArea1.getText().concat(SB.toString()));
                    SB.delete(0, 49999);
                }
            }
            if((DATALEIDA.length()/2)%49999>0){
                jTextArea1.setText(jTextArea1.getText().concat(SB.toString()));
            }
            jTextField8.setText(String.valueOf(jTextArea1.getText().length()));
        }
        jLabel3.setText("LISTO");
        jLabel3.setForeground(Color.GREEN);
    }
    private void D_CripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_CripActionPerformed
        
        h1 = new Thread(this);
        h1.start();
        DCRIP=true;
    }//GEN-LAST:event_D_CripActionPerformed

    private void Random_KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Random_KeyActionPerformed
        jTextField4.setText(null);
        boolean CHECK=true;
        String l=null;
        while(CHECK){
            try{
                l=JOptionPane.showInputDialog("Tamaño de la clave");
                for(int x=0;x<Integer.parseInt(l);x++){
                    jTextField4.setText(jTextField4.getText().concat(Integer.toHexString((int)(Math.random()*256)).toUpperCase()));
                }
                CHECK=false;
            }catch(Exception e){
                if(l!=null){
                    CHECK=true;
                    JOptionPane.showMessageDialog(rootPane, "Solo introducir Numeros", "ERROR", 0);
                }
                else
                    CHECK=false;
            }
        }
    }//GEN-LAST:event_Random_KeyActionPerformed

    private void CripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CripActionPerformed
        h1 = new Thread(this);
        h1.start();
        CRIP=true;
    }//GEN-LAST:event_CripActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea1.setText("");
        jTextField1.setText("");
        HASH_GENERADO.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jLabel2.setText("");
        HASHM="";
        HASHS="";
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            if(jRadioButton5.isSelected())
                HASH_GENERADO.setText(HASHM);
            else
                HASH_GENERADO.setText(HASHS);
            jRadioButton5.setVisible(true);
            jRadioButton6.setVisible(true);
        }else{
            HASH_GENERADO.setText("");
            jRadioButton5.setVisible(false);
            jRadioButton6.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        jLabel1.setText("HASH MD5");
        HASH_GENERADO.setText(HASHM);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        jLabel1.setText("HASH SHA1");
        HASH_GENERADO.setText(HASHS);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        abriri=true;
        h1 = new Thread(this);
        h1.start();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        abrirf=true;
        h1 = new Thread(this);
        h1.start();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        h1=new Thread(this);
        h1.start();
        read=true;
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    CripImagen IMG=new CripImagen();
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(!IMG.isVisible())
            IMG.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        HASHFile HF=new HASHFile();
        HF.setVisible(true);
        HF.setTitle("HASH MD5");
        HF.HASH="MD5";
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        HASHFile HF=new HASHFile();
        HF.setVisible(true);
        HF.setTitle("HASH SHA1");
        HF.HASH="SHA1";
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    public void CLS(){
        jTextArea1.setText("");
        jTextField1.setText("");
        HASH_GENERADO.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jLabel2.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRIPEX16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRIPEX16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRIPEX16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRIPEX16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRIPEX16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crip;
    private javax.swing.JButton D_Crip;
    private javax.swing.JTextField HASH_GENERADO;
    private javax.swing.JButton Random_Key;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private String getArchivo(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
