            package app;
            
            import javax.swing.*;
            import java.awt.*;
            import java.awt.event.*;
            
            public class calc extends JFrame implements ActionListener, MouseListener,FocusListener {
            
                private static final long serialVersionUID = 1L;
                JButton alog;
                JButton exp;
                JButton hyp;
                JButton log;
                JLabel not = new JLabel("");
                JLabel not1 = new JLabel("");
                JButton pwr;
                JButton sqr;
                JButton cbr;
                JButton pi;
                JButton tan;
                JButton sin;
                JButton cos;
                JButton add;
                JButton sub;
                JButton div;
                JButton mul;
                JButton ans;
                JButton rst;
                JButton exit;
                JButton sq;
                JButton cb;
                static double a;
                static double b;
                double no;
                static int op = 0;
                static double c = 0.0D;
                int i;
                double square = 0.0D;
                double faci = 1.0D;
                boolean flag = false;
                JPanel pan;
                JTextField tf = new JTextField(100);
                Font f = new Font("Calibria", 1, 20);
                JLabel jl = new JLabel("@ muthiani.jkuat");
                JButton dp;
                JButton n0;
                JButton n1;
                JButton n2;
                JButton n3;
                JButton n4;
                JButton n5;
                JButton n6;
                JButton n7;
                JButton n8;
                JButton n9;
                JButton game;
            
                calc() {
                    this.tf.setFont(this.f);
                    this.tf.setBackground(Color.WHITE);
                    this.tf.setEditable(false);
                    this.tf.setBounds(20, 70, 350, 50);
                    this.jl.setBounds(50, 500, 200, 30);
                    this.not.setBounds(20, 20, 300, 20);
                    this.not1.setBounds(20, 50, 300, 20);
                    this.jl.setBackground(Color.red);
                    this.dp = new JButton("•");
                    this.dp.setSize(50, 30);
                    this.add = new JButton("+");
                    this.alog = new JButton("DE");
                    this.pwr = new JButton("X^");
                    this.log = new JButton("Log");
                    this.tan = new JButton("Tan");
                    this.sin = new JButton("Sin");
                    this.cos = new JButton("Cos");
                    this.pi = new JButton("π");
                    this.cbr = new JButton("3√X");
                    this.sub = new JButton("-");
                    this.div = new JButton("/");
                    this.sq = new JButton("X²");
                    this.exp = new JButton("ex");
                    this.hyp = new JButton("hp");
                    this.game = new JButton("GG");
                    this.mul = new JButton("*");
                    this.sqr = new JButton("√X");
                    this.rst = new JButton("RESET");
                    this.ans = new JButton("ANS");
                    this.cb = new JButton("x³");
                    this.exit = new JButton("OFF");
                    this.exit.setBackground(Color.red);
                    this.rst.setBackground(Color.gray);
                    this.n0 = new JButton("0");
                    this.n1 = new JButton("1");
                    this.n2 = new JButton("2");
                    this.n3 = new JButton("3");
                    this.n4 = new JButton("4");
                    this.n5 = new JButton("5");
                    this.n6 = new JButton("6");
                    this.n7 = new JButton("7");
                    this.n8 = new JButton("8");
                    this.n9 = new JButton("9");
                    this.add.setSize(50, 30);
                    this.div.setSize(50, 30);
                    this.sub.setSize(50, 30);
                    this.mul.setSize(50, 30);
                    this.rst.setSize(80, 50);
                    this.ans.setSize(50, 50);
                    this.sq.setSize(80, 40);
                    this.exit.setSize(70, 40);
                    this.sqr.setSize(50, 30);
                    this.cb.setSize(40, 40);
                    this.cbr.setSize(80, 50);
                    this.pi.setSize(80, 50);
                    this.tan.setSize(80, 50);
                    this.sin.setSize(80, 50);
                    this.cos.setSize(80, 60);
                    this.pwr.setSize(80, 60);
                    this.log.setSize(80, 60);
                    this.alog.setSize(80, 60);
                    this.exp.setSize(80, 60);
                    this.hyp.setSize(80, 60);
                    this.game.setSize(80, 60);
            
                    add.setBorder(null);
                    sub.setBorder(null);
                    mul.setBorder(null);
                    div.setBorder(null);
                    ans.setBorder(null);
                    cb.setBorder(null);
                    cbr.setBorder(null);
                    pi.setBorder(null);
                    tan.setBorder(null);
                    sin.setBorder(null);
                    cos.setBorder(null);
                    pwr.setBorder(null);
                    log.setBorder(null);
                    alog.setBorder(null);
                    exp.setBorder(null);
                    hyp.setBorder(null);
                    game.setBorder(null);
                    exit.setBorder(null);
                    rst.setBorder(null);
            
                    this.n0.setSize(50, 30);
                    this.n1.setSize(50, 30);
                    this.n2.setSize(50, 30);
                    this.n3.setSize(50, 30);
                    this.n4.setSize(50, 30);
                    this.n5.setSize(50, 30);
                    this.n6.setSize(50, 30);
                    this.n7.setSize(50, 30);
                    this.n8.setSize(50, 30);
                    this.n9.setSize(50, 30);
                    this.add.setBounds(220, 300, 50, 30);
                    this.sub.setBounds(220, 450, 50, 30);
                    this.mul.setBounds(220, 400, 50, 30);
                    this.div.setBounds(220, 350, 50, 30);
                    this.dp.setBounds(100, 450, 50, 30);
                    this.exit.setBounds(40, 150, 60, 30);
                    this.sqr.setBounds(110, 150, 60, 30);
                    this.rst.setBounds(250, 150, 80, 30);
                    this.cb.setBounds(180, 200, 60, 30);
                    this.ans.setBounds(250, 200, 80, 30);
                    this.sq.setBounds(180, 150, 60, 30);
                    this.cbr.setBounds(110, 200, 60, 30);
                    this.pi.setBounds(40, 200, 60, 30);
                    this.tan.setBounds(40, 250, 60, 30);
                    this.sin.setBounds(110, 250, 60, 30);
                    this.cos.setBounds(180, 250, 60, 30);
                    this.log.setBounds(250, 250, 80, 30);
                    this.pwr.setBounds(280, 300, 50, 30);
                    this.alog.setBounds(280, 350, 50, 30);
                    this.hyp.setBounds(280, 400, 50, 30);
                    this.exp.setBounds(160, 450, 50, 30);
                    this.game.setBounds(280, 450, 50, 30);
                    this.game.setForeground(Color.green);
                    this.alog.setForeground(Color.MAGENTA);
                    this.n1.setBounds(40, 300, 50, 30);
                    this.n2.setBounds(100, 300, 50, 30);
                    this.n3.setBounds(160, 300, 50, 30);
                    this.n4.setBounds(40, 350, 50, 30);
                    this.n5.setBounds(100, 350, 50, 30);
                    this.n6.setBounds(160, 350, 50, 30);
                    this.n7.setBounds(40, 400, 50, 30);
                    this.n8.setBounds(100, 400, 50, 30);
                    this.n9.setBounds(160, 400, 50, 30);
                    this.n0.setBounds(40, 450, 50, 30);
                    this.add(this.add);
                    this.add(this.mul);
                    this.add(this.div);
                    this.add(this.rst);
                    this.add(this.ans);
                    this.add(this.sq);
                    this.add(this.sqr);
                    this.add(this.sub);
                    this.add(this.exit);
                    this.add(this.cb);
                    this.add(this.cbr);
                    this.add(this.pi);
                    this.add(this.tan);
                    this.add(this.sin);
                    this.add(this.cos);
                    this.add(this.pwr);
                    this.add(this.log);
                    this.add(this.alog);
                    this.add(this.exp);
                    this.add(this.hyp);
                    this.add(this.game);
                    this.add(this.not1);
                    this.add(this.dp);
                    this.add(this.tf);
                    this.add(this.not);
                    this.game.addMouseListener(this);
                    this.cb.addMouseListener(this);
                    this.cbr.addMouseListener(this);
                    this.sq.addMouseListener(this);
                    this.sqr.addMouseListener(this);
                    this.exp.addMouseListener(this);
                    this.log.addMouseListener(this);
                    this.hyp.addMouseListener(this);
                    this.add.addMouseListener(this);
                    this.sub.addMouseListener(this);
                    this.div.addMouseListener(this);
                    this.sin.addMouseListener(this);
                    this.tan.addMouseListener(this);
                    this.cos.addMouseListener(this);
                    this.pi.addMouseListener(this);
                    this.mul.addMouseListener(this);
                    this.pwr.addMouseListener(this);
                    this.ans.addMouseListener(this);
                    this.pi.addMouseListener(this);
                    this.alog.addMouseListener(this);
                    this.game.addActionListener(this);
                    this.dp.addActionListener(this);
                    this.add.addActionListener(this);
                    this.sub.addActionListener(this);
                    this.mul.addActionListener(this);
                    this.div.addActionListener(this);
                    this.exit.addActionListener(this);
                    this.rst.addActionListener(this);
                    this.ans.addActionListener(this);
                    this.sq.addActionListener(this);
                    this.sqr.addActionListener(this);
                    this.cb.addActionListener(this);
                    this.cbr.addActionListener(this);
                    this.pi.addActionListener(this);
                    this.tan.addActionListener(this);
                    this.cos.addActionListener(this);
                    this.sin.addActionListener(this);
                    this.alog.addActionListener(this);
                    this.log.addActionListener(this);
                    this.pwr.addActionListener(this);
                    this.exp.addActionListener(this);
                    this.hyp.addActionListener(this);
                    this.game.addFocusListener(this);
                    this.pi.addFocusListener(this);
                    this.cb.addFocusListener(this);
                    this.cbr.addFocusListener(this);
                    this.exp.addFocusListener(this);
                    this.sq.addFocusListener(this);
                    this.sqr.addFocusListener(this);
                    this.pwr.addFocusListener(this);
                    this.log.addFocusListener(this);
                    this.sin.addFocusListener(this);
                    this.cos.addFocusListener(this);
                    this.tan.addFocusListener(this);
                    this.hyp.addFocusListener(this);
                    this.mul.addFocusListener(this);
                    this.div.addFocusListener(this);
                    this.sub.addFocusListener(this);
                    this.add.addFocusListener(this);
                    this.ans.addFocusListener(this);
                    this.alog.addFocusListener(this);
                    this.n0.addActionListener(this);
                    this.n1.addActionListener(this);
                    this.n2.addActionListener(this);
                    this.n3.addActionListener(this);
                    this.n4.addActionListener(this);
                    this.n5.addActionListener(this);
                    this.n6.addActionListener(this);
                    this.n7.addActionListener(this);
                    this.n8.addActionListener(this);
                    this.n9.addActionListener(this);
                    n1.setBorder(null);
                    n2.setBorder(null);
                    n3.setBorder(null);
                    n4.setBorder(null);
                    n5.setBorder(null);
                    n6.setBorder(null);
                    n7.setBorder(null);
                    n8.setBorder(null);
                    n9.setBorder(null);
                    n0.setBorder(null);
                    jl.setBorder(null);
                    sq.setBorder(null);
                    sqr.setBorder(null);
                    dp.setBorder(null);
            
                    this.add(this.n1);
                    this.add(this.n2);
                    this.add(this.n3);
                    this.add(this.n4);
                    this.add(this.n5);
                    this.add(this.n6);
                    this.add(this.n7);
                    this.add(this.n8);
                    this.add(this.n9);
                    this.add(this.n0);
                    this.add(this.jl);
                    this.setLayout((LayoutManager)null);
                    this.setSize(410, 600);
                    setLocationRelativeTo(null);
            
                    this.setResizable(false);
                    setTitle("                KRYON  CALC_01 ");
                    this.setVisible(true);
                    this.setDefaultCloseOperation(3);
                }
            
                public void focusGained(FocusEvent e) {
                    if (e.getSource() == this.cb) {
                        this.not.setText("use format >>number,then >>x³");
                    }
            
                    if (e.getSource() == this.game) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.hyp) {
                        this.not.setText("use format >>base>>hp>>hieght>>answer");
                    }
            
                    if (e.getSource() == this.mul) {
                        this.not.setText("use format >>number>>(X)>>number>>answer");
                    }
            
                    if (e.getSource() == this.cbr) {
                        this.not.setText("use format >>number,then >>3√X");
                    }
            
                    if (e.getSource() == this.sq) {
                        this.not.setText("use format >>number,then >>X²");
                    }
            
                    if (e.getSource() == this.sqr) {
                        this.not.setText("use format >>number,then >>√X");
                    }
            
                    if (e.getSource() == this.tan) {
                        this.not.setText("use format >>angle,then >>Tan");
                    }
            
                    if (e.getSource() == this.pi) {
                        this.not.setText("use format >>number>>π");
                    }
            
                    if (e.getSource() == this.sin) {
                        this.not.setText("use format >>angle,then >>Sin");
                    }
            
                    if (e.getSource() == this.cos) {
                        this.not.setText("use format >>angle,then >>Cos");
                    }
            
                    if (e.getSource() == this.log) {
                        this.not.setText("use format >>number,then >>log");
                    }
            
                    if (e.getSource() == this.exp) {
                        this.not.setText("use format >>number,then >>ex");
                    }
            
                    if (e.getSource() == this.add) {
                        this.not.setText("use format >>number>>(+)>>number>>answer");
                    }
            
                    if (e.getSource() == this.sub) {
                        this.not.setText("use format >>number>>(-)>>number>>answer");
                    }
            
                    if (e.getSource() == this.div) {
                        this.not.setText("use format >>number>>(/)>>number>>answer");
                    }
            
                    if (e.getSource() == this.pwr) {
                        this.not.setText("use format >>mantisa,>>x^,>>index,answer");
                    }
            
                    if (e.getSource() == this.hyp) {
                        this.not.setText("use format >>number>>hp>>number>>answer");
                    }
            
                }
            
                public void mouseClicked(MouseEvent e) {
                }
            
                public void mousePressed(MouseEvent e) {
                }
            
                public void mouseReleased(MouseEvent e) {
                }
            
                public void mouseEntered(MouseEvent e) {
                }
            
                public void mouseExited(MouseEvent e) {
                    if (e.getSource() == this.cb) {
                        this.not1.setText("returns cube");
                    }
            
                    if (e.getSource() == this.ans) {
                        this.not1.setText("returns current answer");
                    }
            
                    if (e.getSource() == this.game) {
                        this.not1.setText("Opens Kryon Game");
                    }
            
                    if (e.getSource() == this.pi) {
                        this.not1.setText("arithmetic PI");
                    }
            
                    if (e.getSource() == this.cbr) {
                        this.not1.setText("returns cuberoot");
                    }
            
                    if (e.getSource() == this.sq) {
                        this.not1.setText("returns square");
                    }
            
                    if (e.getSource() == this.mul) {
                        this.not1.setText("product operator");
                    }
            
                    if (e.getSource() == this.sqr) {
                        this.not1.setText("returns square root");
                    }
            
                    if (e.getSource() == this.tan) {
                        this.not1.setText("returns tangent of angle");
                    }
            
                    if (e.getSource() == this.sin) {
                        this.not1.setText("returns sine of angle");
                    }
            
                    if (e.getSource() == this.cos) {
                        this.not1.setText("returns cosine of angle");
                    }
            
                    if (e.getSource() == this.pwr) {
                        this.not1.setText("returns given index");
                    }
            
                    if (e.getSource() == this.add) {
                        this.not1.setText("addition operator");
                    }
            
                    if (e.getSource() == this.sub) {
                        this.not1.setText("subtraction operator");
                    }
            
                    if (e.getSource() == this.div) {
                        this.not1.setText("division operator");
                    }
            
                    if (e.getSource() == this.log) {
                        this.not1.setText("returns logarithm");
                    }
            
                    if (e.getSource() == this.exp) {
                        this.not1.setText("returns exponential");
                    }
            
                    if (e.getSource() == this.hyp) {
                        this.not1.setText("returns hypotenuse");
                    }
            
                }
            
                public void focusLost(FocusEvent e) {
                    if (e.getSource() == this.cb) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.cbr) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.sq) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.sqr) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.exit) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.hyp) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.rst) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.add) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.sub) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.mul) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.div) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.exp) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.log) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.ans) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.tan) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.cos) {
                        this.not.setText("");
                    }
            
                    if (e.getSource() == this.sin) {
                        this.not.setText("");
                    }
            
                }
            
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == this.dp) {
                        this.tf.setText(this.tf.getText().concat("."));
                    }
            
                    if (e.getSource() == this.n0) {
                        this.tf.setText(this.tf.getText().concat("0"));
                    }
            
                    if (e.getSource() == this.n1) {
                        this.tf.setText(this.tf.getText().concat("1"));
                    }
            
                    if (e.getSource() == this.n2) {
                        this.tf.setText(this.tf.getText().concat("2"));
                    }
            
                    if (e.getSource() == this.n3) {
                        this.tf.setText(this.tf.getText().concat("3"));
                    }
            
                    if (e.getSource() == this.n4) {
                        this.tf.setText(this.tf.getText().concat("4"));
                    }
            
                    if (e.getSource() == this.n5) {
                        this.tf.setText(this.tf.getText().concat("5"));
                    }
            
                    if (e.getSource() == this.n6) {
                        this.tf.setText(this.tf.getText().concat("6"));
                    }
            
                    if (e.getSource() == this.n7) {
                        this.tf.setText(this.tf.getText().concat("7"));
                    }
            
                    if (e.getSource() == this.n8) {
                        this.tf.setText(this.tf.getText().concat("8"));
                    }
            
                    if (e.getSource() == this.n9) {
                        this.tf.setText(this.tf.getText().concat("9"));
                    }
            
                    try {
                        if (e.getSource() == this.add) {
                            a = Double.parseDouble(this.tf.getText());
                            op = 1;
                            this.tf.setText("");
                        }
            
                        if (e.getSource() == this.sub) {
                            a = Double.parseDouble(this.tf.getText());
                            op = 2;
                            this.tf.setText("");
                        }
            
                        if (e.getSource() == this.mul) {
                            a = Double.parseDouble(this.tf.getText());
                            op = 3;
                            this.tf.setText("");
                        }
            
                        if (e.getSource() == this.div) {
                            a = Double.parseDouble(this.tf.getText());
                            op = 4;
                            this.tf.setText("");
                        }
            
                        if (e.getSource() == this.sq) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = this.no * this.no;
                            this.tf.setText("" + this.square);
                        }
            
                        if (e.getSource() == this.sqr) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = Math.sqrt(this.no);
                            this.tf.setText("" + this.square);
                        }
            
                        if (e.getSource() == this.cb) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = this.no * this.no * this.no;
                            this.tf.setText("" + this.square);
                        }
            
                        if (e.getSource() == this.cbr) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = Math.cbrt(this.no);
                            this.tf.setText("" + this.square);
                        }
            
                        if (e.getSource() == this.pi) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = 3.141592653589793D;
                            this.tf.setText("" + this.no * this.square);
                        }
            
                        if (e.getSource() == this.tan) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = 0.017453292519943295D * this.no;
                            this.tf.setText("" + Math.tan(this.square));
                        }
            
                        if (e.getSource() == this.sin) {
                            this.no = Double.parseDouble("+" + this.tf.getText());
                            this.square = 0.017453292519943295D * this.no;
                            this.tf.setText("" + Math.sin(this.square));
                        }
            
                        if (e.getSource() == this.cos) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = 0.017453292519943295D * this.no;
                            this.tf.setText("" + Math.cos(this.square));
                        }
            
                        if (e.getSource() == this.alog) {
                            String s = this.tf.getText();
                            this.tf.setText("");
            
                            for(int i = 0; i < s.length() - 1; ++i) {
                                this.tf.setText(this.tf.getText() + s.charAt(i));
                            }
                        }
            
                        if (e.getSource() == this.log) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.square = Math.log10(this.no);
                            this.tf.setText("" + this.square);
                        }
            
                        if (e.getSource() == this.pwr) {
                            a = Double.parseDouble(this.tf.getText());
                            this.tf.setText("");
                            op = 5;
                        }
            
                        if (e.getSource() == this.exp) {
                            this.no = Double.parseDouble(this.tf.getText());
                            this.tf.setText("" + Math.exp(this.no));
                        }
            
                        if (e.getSource() == this.hyp) {
                            a = Double.parseDouble(this.tf.getText());
                            this.tf.setText("");
                            op = 6;
                        }
            
                        if (e.getSource() == this.ans) {
                            b = Double.parseDouble(this.tf.getText());
                            switch(op) {
                                case 1:
                                    c = a + b;
                                    this.tf.setText("" + c);
                                    break;
                                case 2:
                                    c = a - b;
                                    this.tf.setText("" + c);
                                    break;
                                case 3:
                                    c = a * b;
                                    this.tf.setText("" + c);
                                    break;
                                case 4:
                                    c = a / b;
                                    this.tf.setText("" + c);
                                    break;
                                case 5:
                                    c = Math.pow(a, b);
                                    this.tf.setText("" + c);
                                    break;
                                case 6:
                                    c = Math.hypot(b, a);
                                    this.tf.setText("" + c);
                            }
                        }
                    } catch (Exception var4) {
                        JOptionPane.showMessageDialog((Component)null, "Invalid Input");
                    }
            
                    if (e.getSource() == this.rst) {
                        this.tf.setText("");
                        this.not.setText("");
                        this.not1.setText("");
                    }
            
                    if (e.getSource() == this.exit) {
                        this.dispose();
                    }
            
                    e.getSource();
                }
            }
