
import java.util.Scanner;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GridLayoutTestingground {

    // public static void Rechnung(String playerInput, String computerGuess)

    private static char    operator              = '?';
    private static boolean hasOperatorBeenChosen = false;
    private static String  zahl1                 = null;
    private static String  zahl2                 = null;

    public static void handleUserNumberInput(String number, Text text0) {
        System.out.println(number);

        if (hasOperatorBeenChosen == false) {
            if (zahl1 == null) {
                zahl1 = number;
                text0.setText(zahl1);
            } else {
                zahl1 += number;
                text0.setText(zahl1);
            }
        } else {
            if (zahl2 == null) {
                zahl2 = number;
                text0.setText(zahl1 + operator + zahl2);
            } else {
                zahl2 += number;
                text0.setText(zahl1 + operator + zahl2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            hasOperatorBeenChosen = true;
        }

        Display display = new Display();
        Shell shell = new Shell(display);
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 4;
        gridLayout.makeColumnsEqualWidth = true;
        shell.setLayout(gridLayout);

        Text text0 = new Text(shell, SWT.BORDER);
        text0.setText("");
        GridData data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        data.horizontalSpan = 4;
        data.verticalSpan = 2;
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = true;
        text0.setLayoutData(data);

        Button button1 = new Button(shell, SWT.PUSH);
        button1.setText("1");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = true;
        button1.setLayoutData(data);

        Button button2 = new Button(shell, SWT.PUSH);
        button2.setText("2");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button2.setLayoutData(data);

        Button button3 = new Button(shell, SWT.PUSH);
        button3.setText("3");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button3.setLayoutData(data);

        Button button4 = new Button(shell, SWT.PUSH);
        button4.setText("/");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button4.setLayoutData(data);

        Button button5 = new Button(shell, SWT.PUSH);
        button5.setText("4");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = true;
        button5.setLayoutData(data);

        Button button6 = new Button(shell, SWT.PUSH);
        button6.setText("5");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button6.setLayoutData(data);

        Button button7 = new Button(shell, SWT.PUSH);
        button7.setText("6");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button7.setLayoutData(data);

        Button button8 = new Button(shell, SWT.PUSH);
        button8.setText("x");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button8.setLayoutData(data);

        Button button9 = new Button(shell, SWT.PUSH);
        button9.setText("7");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = true;
        button9.setLayoutData(data);

        Button button0 = new Button(shell, SWT.PUSH);
        button0.setText("8");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button0.setLayoutData(data);

        Button button10 = new Button(shell, SWT.PUSH);
        button10.setText("9");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button10.setLayoutData(data);

        Button button11 = new Button(shell, SWT.PUSH);
        button11.setText("-");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button11.setLayoutData(data);

        Button button12 = new Button(shell, SWT.PUSH);
        button12.setText("0");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button12.setLayoutData(data);

        Button button13 = new Button(shell, SWT.PUSH);
        button13.setText(".");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button13.setLayoutData(data);

        Button button14 = new Button(shell, SWT.PUSH);
        button14.setText("=");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        data.grabExcessHorizontalSpace = true;
        data.grabExcessVerticalSpace = true;
        button14.setLayoutData(data);

        Button button15 = new Button(shell, SWT.PUSH);
        button15.setText("+");
        data = new GridData();
        data.horizontalAlignment = GridData.FILL;
        data.verticalAlignment = GridData.FILL;
        button15.setLayoutData(data);
        

        button1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("1", text0);
            }
        });

        button2.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("2", text0);
            }
        });

        button3.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("3", text0);
            }
        });
        button4.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (zahl1 != null && hasOperatorBeenChosen == false) {
                System.out.println(" / ");
                operator = '/';
                hasOperatorBeenChosen = true;
                text0.setText(zahl1 + operator);
            }
            }     
        });


        button5.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("4", text0);
            }
        });

        button6.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("5", text0);
            }
        });

        button7.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("6", text0);
            }
        });

        button8.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (zahl1 != null && hasOperatorBeenChosen == false) {
                System.out.println(" *  ");
                operator = '*';
                hasOperatorBeenChosen = true;
                text0.setText(zahl1 + operator);
            }
           }
        });
        

        button9.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("7", text0);
            }
        });

        button0.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("8", text0);
            }
        });

        button10.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("9", text0);
            }
        });

        button11.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (zahl1 != null && hasOperatorBeenChosen == false) {
                System.out.println(" - ");
                operator = '-';
                hasOperatorBeenChosen = true;
                text0.setText(zahl1 + operator);
            }
           }
        });
        

        button12.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleUserNumberInput("0", text0);
            }
        });

        button15.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (zahl1 != null && hasOperatorBeenChosen == false) {
                System.out.println(" + ");
                operator = '+';
                hasOperatorBeenChosen = true;
                text0.setText(zahl1 + operator);
            }
           }
        });
        

        button13.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                System.out.println(".");
                if (hasOperatorBeenChosen == false) {
                    zahl1 += ".";
                    text0.setText(zahl1);
                } else {
                    zahl2 += ".";
                    text0.setText(zahl1 + operator + zahl2);
                }
            }
        });

       // zahl2.indexOf(zahl2);

        button14.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (zahl2 != null) {
                System.out.println("=");
                Float zahl3 = Float.parseFloat(zahl1);
                Float zahl4 = Float.parseFloat(zahl2);
                
                System.out.println(zahl1 + operator + zahl2);
                
                if (operator == '+') {
                    System.out.println(zahl1 + operator + zahl2 + " = " + (zahl3 + zahl4));
                    text0.setText(zahl1 + operator + zahl2 + " = " + (zahl3 + zahl4));
                }

                if (operator == '-') {
                    System.out.println(zahl1 + operator + zahl2 + " = " + (zahl3 - zahl4));
                    text0.setText(zahl1 + operator + zahl2 + " = " + (zahl3 - zahl4));

                }

                if (operator == '*') {
                    System.out.println(zahl1 + operator + zahl2 + " = " + (zahl3 * zahl4));
                    text0.setText(zahl1 + operator + zahl2 + " = " + (zahl3 * zahl4));

                }

                if (operator == '/') {
                    System.out.println(zahl1 + operator + zahl2 + " = " + (zahl3 / zahl4));
                    text0.setText(zahl1 + operator + zahl2 + " = " + (zahl3 / zahl4));
                }
                } else {}
            }
        });

        System.out.println(zahl1 + operator + zahl2 + " = ");

        shell.pack();
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }

        display.dispose();
    }
    
    
}
