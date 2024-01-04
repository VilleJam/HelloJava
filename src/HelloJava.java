import javax.swing.*;

public class HelloJava {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );

        JLabel label = new JLabel( "<html>Voobsche tut mojet bit' lyuboi yazik.<br/>No ya hotel skazat', chto ya lyublyu tebya!<html/>", JLabel.CENTER );
        frame.add( new HelloComponent() );
        frame.setSize( 500, 500 );

        frame.setVisible( true );

    }
}