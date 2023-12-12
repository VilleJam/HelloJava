import javax.swing.*;

public class HelloJava {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );
        JFrame frame1 = new JFrame( "VAZHNO" );
        JLabel label = new JLabel( "Voobsche tut mojet bit' lyuboi yazik.", JLabel.CENTER );
        JLabel label1 = new JLabel("No ya hotel skazat chto ya tebya lyublyu!", JLabel.CENTER );
        frame.add( label );
        frame1.add( label1 );
        frame.setSize( 300, 300 );
        frame1.setSize( 300, 300 );
        frame.setVisible( true );
        frame1.setVisible( true );
    }
}
