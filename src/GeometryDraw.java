import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeometryDraw extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    private int startX, startY, endX, endY;
    private String shape = "Line";
    private Color color = Color.BLACK;

    public GeometryDraw() {
        super("Geometry Drawing Program");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu shapeMenu = new JMenu("Shapes");
        JMenuItem lineMenuItem = new JMenuItem("Line");
        lineMenuItem.addActionListener(this);
        shapeMenu.add(lineMenuItem);
        JMenuItem rectangleMenuItem = new JMenuItem("Rectangle");
        rectangleMenuItem.addActionListener(this);
        shapeMenu.add(rectangleMenuItem);
        JMenuItem circleMenuItem = new JMenuItem("Circle");
        circleMenuItem.addActionListener(this);
        shapeMenu.add(circleMenuItem);
        menuBar.add(shapeMenu);

        //颜色
        JMenu colorMenu = new JMenu("Color");
        //White
        JMenuItem WhiteMenuItem = new JMenuItem("White");
        WhiteMenuItem.addActionListener(this);
        colorMenu.add(WhiteMenuItem);
        //LightGray
        JMenuItem LightGrayMenuItem = new JMenuItem("LightGray");
        LightGrayMenuItem.addActionListener(this);
        colorMenu.add(LightGrayMenuItem);
        //Gray
        JMenuItem GrayMenuItem = new JMenuItem("Gray");
        GrayMenuItem.addActionListener(this);
        colorMenu.add(GrayMenuItem);
        //DarkGray
        JMenuItem DarkGrayMenuItem = new JMenuItem("DarkGray");
        DarkGrayMenuItem.addActionListener(this);
        colorMenu.add(DarkGrayMenuItem);
        //Black
        JMenuItem BlackMenuItem = new JMenuItem("Black");
        BlackMenuItem.addActionListener(this);
        colorMenu.add(BlackMenuItem);
        //Red
        JMenuItem RedMenuItem = new JMenuItem("Red");
        RedMenuItem.addActionListener(this);
        colorMenu.add(RedMenuItem);
        //Pink
        JMenuItem PinkMenuItem = new JMenuItem("Pink");
        PinkMenuItem.addActionListener(this);
        colorMenu.add(PinkMenuItem);
        //Orange
        JMenuItem OrangeMenuItem = new JMenuItem("Orange");
        OrangeMenuItem.addActionListener(this);
        colorMenu.add(OrangeMenuItem);
        //Yellow
        JMenuItem YellowMenuItem = new JMenuItem("Yellow");
        YellowMenuItem.addActionListener(this);
        colorMenu.add(YellowMenuItem);
        //Green
        JMenuItem GreenMenuItem = new JMenuItem("Green");
        GreenMenuItem.addActionListener(this);
        colorMenu.add(GreenMenuItem);
        //Magenta
        JMenuItem MagentaMenuItem = new JMenuItem("Magenta");
        MagentaMenuItem.addActionListener(this);
        colorMenu.add(MagentaMenuItem);
        //Blue
        JMenuItem CyanMenuItem = new JMenuItem("Cyan");
        CyanMenuItem.addActionListener(this);
        colorMenu.add(CyanMenuItem);
        //Blue
        JMenuItem BlueMenuItem = new JMenuItem("Blue");
        BlueMenuItem.addActionListener(this);
        colorMenu.add(BlueMenuItem);

        menuBar.add(colorMenu);
        setJMenuBar(menuBar);

        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(800, 600);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        switch (shape) {
            case "Line" -> g.drawLine(startX, startY, endX, endY);
            case "Rectangle" -> g.drawRect(startX, startY, endX - startX, endY - startY);
            case "Circle" -> {
                int diameter = (int) Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
                g.drawOval(startX - diameter / 2, startY - diameter / 2, diameter - 1, diameter - 1);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            //形状
            case "Line" -> shape = "Line";
            case "Rectangle" -> shape = "Rectangle";
            case "Circle" -> shape = "Circle";
            //颜色
            case "White" -> color = Color.WHITE;
            case "LightGray" -> color = Color.LIGHT_GRAY;
            case "Gray" -> color = Color.GRAY;
            case "DarkGray" -> color = Color.DARK_GRAY;
            case "Black" -> color = Color.BLACK;
            case "Red" -> color = Color.RED;
            case "Pink" -> color = Color.PINK;
            case "Orange" -> color = Color.ORANGE;
            case "Yellow" -> color = Color.YELLOW;
            case "Green" -> color = Color.GREEN;
            case "Magenta" -> color = Color.MAGENTA;
            case "Cyan" -> color = Color.CYAN;
            case "Blue" -> color = Color.BLUE;



        }
    }

    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {}

    public void mouseDragged(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new GeometryDraw();
    }
}