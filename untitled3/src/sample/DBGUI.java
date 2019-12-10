package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.text.TableView;
import javax.swing.text.TextAction;

public class DBGUI {
    private javafx.scene.control.TableView table;
    private TreeView<String> tree;
    private Button[] buttons;
    private Label[] labels;
    private TextField[] txt;
    private TextArea txtArea;
    private final String[] btntext = {"clear", "save", "update", "delete", "print", "search"};

    private final ObservableList<Person> data = FXCollections.observableArrayList(
            new Person("asdf1", "name1", "1@naver.com"),
            new Person("asdf2", "name2", "2@naver.com"),
            new Person("asdf3", "name3", "3@naver.com"),
            new Person("asdf4", "name4", "4@naver.com"),
            new Person("asdf5", "name5", "5@naver.com")
    );

    public void displayDBGUI() {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        vbox.setSpacing(20);
        vbox.setMinSize(900, 500);
        vbox.setMaxSize(1000, 700);
        vbox.setPadding(new Insets(15, 15, 15, 15));
        vbox.setSpacing(10);
        vbox.setStyle("-fx-border-color: Black;");


        // top
        HBox tbox = addTopPane();
        tbox.prefHeightProperty().bind(vbox.prefWidthProperty());
        vbox.getChildren().add(tbox);

        // center pane

        HBox cbox = addCenterPane();
        cbox.prefHeightProperty().bind(vbox.prefWidthProperty());
        vbox.getChildren().add(cbox);

        // bottom
        StackPane bbox = addBottomPane();
        bbox.prefHeightProperty().bind(vbox.prefWidthProperty());
        vbox.getChildren().add(bbox);

        // create and show stage

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.setTitle("GUI for data structure");
        stage.show();


    }

    private HBox addTopPane() {
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setSpacing(10);
        hBox.setStyle("-fx-border-color: Blue;");

        buttons = new Button[6];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(btntext[i]);
            buttons[i].setPrefSize(80, 20);
            buttons[i].prefHeightProperty().bind(hBox.prefHeightProperty());
        }

        for(int i = 0 ; i < buttons.length; i++){
            final int j = i;
            buttons[j].setOnAction((event)->{
                String str = buttons[j].getText();
                txtArea.appendText("You have clicked" + str + "\n");
            });
        }
        hBox.getChildren().addAll(buttons);

        return hBox;
    }

    private StackPane addBottomPane() {
        StackPane stack = new StackPane();
        stack.setMaxHeight(150);
        stack.setMinHeight(150);
        stack.setPrefHeight(150);

        stack.setStyle("-fx-border-color: #336699;");
        txtArea = new TextArea();
        txtArea.appendText("");
        txtArea.prefHeightProperty().bind(stack.prefHeightProperty());
        stack.getChildren().add(txtArea);
        return stack;

    }

    private HBox addCenterPane() {
        HBox hb1 = new HBox();
        VBox vb = new VBox();
        table = new javafx.scene.control.TableView<Person>();
        // 수정
        table.setMinSize(600, 150);
        table.setMaxSize(600, 150);
        table.setStyle("-fx-border-color: Black;");
        table.prefWidthProperty().bind(vb.prefWidthProperty());
        table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        table.getSelectionModel().setCellSelectionEnabled(false);

        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(200);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(200);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        table.getSelectionModel().selectedItemProperty().addListener((v, oldV, newV) -> {
            showFields();
        });

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(15, 15, 15, 125));
        gp.setHgap(5);
        gp.setVgap(5);
        gp.setStyle("-fx-border-folor: Green;");
        gp.prefHeightProperty().bind(table.prefWidthProperty());
        txt = new TextField[10];
        labels = new Label[10];

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new Label("Labell..");
            labels[i].setMinSize(150, 20);
            txt[i] = new TextField("Text...");
            txt[i].setMinSize(300, 20);
            gp.addRow(i, labels[i], txt[i]);
            labels[i].prefHeightProperty().bind(gp.widthProperty());
            txt[i].prefHeightProperty().bind(gp.widthProperty());

        }
        vb.getChildren().addAll(table, gp);
        //hb1.getChildren().add(vb);


        //
        StackPane stack = new StackPane();

        TreeView<String> tree = new TreeView<String>();
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

        tree.setRoot(root);
        tree.setMaxWidth(150);
        tree.prefWidthProperty().bind(stack.prefWidthProperty());

        tree.getSelectionModel().selectedItemProperty().addListener((v, oldvalue, newvalue) -> {
            if (oldvalue != newvalue) {
                String str = tree.getSelectionModel().selectedItemProperty().getValue().getValue().toString();
                txtArea.appendText("you select" + str + "\n");
            }
        });

        stack.getChildren().add(tree);

        hb1.prefWidthProperty().bind(vb.prefWidthProperty());
        hb1.getChildren().addAll(stack, vb); // vb 도 들어가야 하는데 지금 버그남.
        //hb1.getChildren().addAll(stack);

        return hb1;
    }

    private void showFields() {

        clearFields();
        TablePosition pos = (TablePosition) table.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        int cols = table.getColumns().size();

        for (int j = 0; j < cols; j++) {
            Object ch = ((TableColumnBase) table.getColumns().get(j)).getText();
            Object cell = ((TableColumnBase) table.getColumns().get(j)).getCellData(row).toString();

            txt[j].setText(cell.toString());
            txt[j].setVisible(true);
            labels[j].setText(ch.toString());
            labels[j].setVisible(true);
        }

    }

    private void clearFields() {
        for (int i = 0; i < txt.length; i++) {
            txt[i].setText("");
            txt[i].setVisible(false);
            labels[i].setText("");
            labels[i].setVisible(false);
        }
    }
}

