import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloJava2 {
    public static void main( String args[] ) {
        JFrame frame = new JFrame( "HelloJava2" );
            frame.add( new HelloComponent2 ( "PIDOR!" ) );
            frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            frame.setSize( 800, 600 );
            frame.setVisible( true );
    }

}

