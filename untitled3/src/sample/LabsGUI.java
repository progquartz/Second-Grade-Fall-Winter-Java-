package sample;

import Lab01.Lab01;
import Lab02.Examples02;
import Lab03.Deck;
import Lab03.Race;
import Lab03.TicTacToe;
import Lab05.*;
import Lab04.Lab04Test;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static Lab04.Lab04Test.*;
import static Lab06.Lab06Test.*;


public class LabsGUI {
    private TreeView<String> treeView;
    private TextArea textArea;
    public void displayLabsGUI() {
        Stage stage = new Stage();
        VBox root = new VBox();
        root.setMinSize(700, 400);
        root.setMaxSize(900, 600);
        root.setPadding(new Insets(15, 15, 15, 15));
        root.setStyle("-fx-border-color: Black");
        HBox hBox = addCenterPane();
        hBox.prefHeightProperty().bind(root.prefHeightProperty());
        root.getChildren().add(hBox);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("GUI for labs");
        stage.show();
    }
    private HBox addCenterPane() {
        HBox hBox = new HBox();
        hBox.setSpacing(50);
        hBox.setPadding(new Insets(15));
        hBox.setStyle("-fx-border-color: Blue");
        TreeItem<String> root, lab01, lab02, lab03, lab04, lab05, lab06;
        root = new TreeItem<>("All labs");
        lab01 = new TreeItem<>("Lab01");
        TreeItem<String> lab0101, lab0102;
        lab0101 = new TreeItem<>("Task 01");
        lab0102 = new TreeItem<>("Task 02");
        lab01.getChildren().addAll(lab0101, lab0102);
        lab02 = new TreeItem<>("Lab02");
        lab03 = new TreeItem<>("Lab03");
        lab04 = new TreeItem<>("Lab04");
        lab05 = new TreeItem<>("Lab05");
        lab06 = new TreeItem<>("Lab06");
        root.getChildren().addAll(lab01, lab02, lab03, lab04, lab05, lab06);
        treeView = new TreeView<>(root);
        treeView.getSelectionModel().selectedItemProperty().addListener((v,oldvalue,newvalue) ->{
            if(oldvalue != newvalue){
                String str = treeView.getSelectionModel().selectedItemProperty().getValue().getValue().toString();
                textArea.appendText("you select" + str);
                if(str.equals("Lab05")){
                    testLab05();
                }
                else if(str.equals("Lab01")){
                    testLab01();
                }
                else if(str.equals("Lab02")){
                    testLab02();
                }
                else if(str.equals("Lab03")){
                    testLab03();
                }
                else if(str.equals("Lab04")){
                    testLab04();
                }
                else if(str.equals("Lab06")){
                    testLab06();
                }
        }
        });
        textArea = new TextArea();
        textArea.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        textArea.appendText("");

        hBox.getChildren().addAll(treeView, textArea);
        return hBox;
    }

    public void testLab05(){
        GeometricObject[] gi = new GeometricObject[3];
        gi[0] = new Circle(3);
        gi[1] = new ResizableCircle(5);
        ResizableCircle c1 = new ResizableCircle(6);
        c1.resize(50);
        gi[2] = c1;
        for(GeometricObject c:gi) {
            textArea.appendText(c.getPerimeter() / 2 / Math.PI + "\n");
            textArea.appendText(c.getPerimeter() + "\n");
            textArea.appendText(c.getArea() + "\n");
        }

        Payable[] po = new Payable[5];
        po[0] = new Invoice("1111","tiers",7,200.0);
        //po[1] = new Employee()'' 다음과 같이 employ는 abstract여서 사용할수 없음.
        po[1] = new SalariedEmployee("Name1", "Name2","asdx",5000.0);
        po[2] = new Invoice("1232","seats",27,100.0);
        po[3] = new BasePlusCommissionEmployee("Name3", "Name4", "asdz",123.3,1,1232);
        po[4] = new HourlyEmployee("Name5", "Name6", "askdlzk", 123,132);

        for(Payable p:po){
            System.out.println();
        }
    }

    public void testLab02(){
        Examples02 ex02= new Examples02();

        ex02.PrimitiveTypesMinMax();
        ex02.drawDiamond();
        ex02.MysterySeries();
        //ex02.TwoLargest();
        ex02.NonPrimeList();
        ex02.OddEvenSum();
        ex02.PrimeList();
    }

    public void testLab01(){
        Lab01 testLab = new Lab01();
        testLab.infoCircle();
        testLab.bmiCalculator();
        testLab.wpCalculator();
    }

    public void testLab03(){
        Deck dk = new Deck();
        dk.printDeck();
        dk.shuffle();
        dk.printDeck();
        dk.dealCard();

        Race rc = new Race();
        rc.run();
        TicTacToe a = new TicTacToe();
        a.play();
    }

    public void testLab04(){
        testPoint();
        System.out.println();
        testLine();
        System.out.println();
        testTriangle();
        System.out.println();
        testQuad();
        System.out.println();
        testCommisionEmployee();
        System.out.println();
        testHourlyEmployee();
        System.out.println();
        testSalariedemployee();
    }

    public void testLab06(){
        testList();
        testPolynomial();
        testConcate();
        TestMazeStack();;
        TestMazeQueue();
        testEmployee();
    }
}
