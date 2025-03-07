import java.util.List;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application  {
    public String userId ;
    private List<Book> books;
    private List<User> users;
    Library library = new Library();
    public void main(String name){
        userId = name;
    }
    @SuppressWarnings("unused")
    public void start(Stage window) {
        window.setResizable(false); 
        VBox rightPanel = new VBox(10);
        rightPanel.setPrefWidth(20);
        rightPanel.setStyle("-fx-background-color: rgb(255, 255, 255) ; -fx-padding:20");

        BorderPane layout = new BorderPane();
        StackPane layoutS = new StackPane();
        layoutS.setStyle("-fx-background-color: rgb(0, 102, 255)");
        VBox leftPanel = new VBox(10);
        leftPanel.setPrefWidth(200);
        leftPanel.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-padding: 20;");
        //Objects

        //icon
        ImageView icon = new ImageView(new Image("profile.png"));
        icon.setFitWidth(180);
        icon.setFitHeight(130);
        Label account = new Label(userId,icon);
        account.setWrapText(true);
        account.setPrefSize(200,90);
        account.setStyle("-fx-font-size: 25px; -fx-font-weight:Bold");
        account.setContentDisplay(javafx.scene.control.ContentDisplay.TOP);

       //Button
        Button home = new Button("Home");
        Button button = new Button("Add book");
        Button button2 = new Button("Book Datel");
        Button button3 = new Button("Display book");
        Button button4 = new Button("User Datel");
        Button button5 = new Button("Borrowed Books");
        Button button6 = new Button("Themes settings");
        Button exitButton = new Button("Exit");
        home.setStyle("-fx-font-weight:Bold;");
        button.setStyle("-fx-font-weight:Bold;");
        button2.setStyle("-fx-font-weight:Bold;");
        button3.setStyle("-fx-font-weight:Bold;");
        button4.setStyle("-fx-font-weight:Bold;");
        button5.setStyle("-fx-font-weight:Bold;");
        button6.setStyle("-fx-font-weight:Bold;");
        exitButton.setStyle("-fx-background-color:red; -fx-font-weight:Bold;");

        home.setPrefSize(180, 50);
        button.setPrefSize(180, 50);
        button2.setPrefSize(180, 50);
        button3.setPrefSize(180, 50);
        button4.setPrefSize(180, 50);
        button5.setPrefSize(180, 50);
        button6.setPrefSize(180, 50);
        exitButton.setPrefSize(180, 50);
        
        //Label
        Label labelLMS = new Label("GCT-LMS (Libary Managment System)");
        labelLMS.setPrefHeight(50);
        GridPane.setHalignment(labelLMS, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(labelLMS, javafx.geometry.VPos.CENTER);
        labelLMS.setStyle("-fx-font-size: 25px; -fx-text-fill: rgb(255, 255, 255);-fx-font-weight:Bold;");
        //========Start Home Button================
        //Dublicat Button for Home page
        Button hButton1 = new Button("Book's");
        Button hButton2 = new Button("Authors");
        Button hButton3 = new Button("Borrowed");
        Button hButton4 = new Button("User's");
        Button hButton5 = new Button("Otherice User");
        Button hButton6 = new Button(" Latest Book's");
        hButton1.setPrefSize(200, 40);
        hButton2.setPrefSize(200, 40);
        hButton3.setPrefSize(200, 40);
        hButton4.setPrefSize(200, 40);
        hButton5.setPrefSize(200, 40);
        hButton6.setPrefSize(1300, 40);
        hButton1.setStyle("-fx-background-color: rgb(78, 255, 72); -fx-padding:20");
        hButton2.setStyle("-fx-background-color: rgb(78, 255, 72); -fx-padding:20");
        hButton3.setStyle("-fx-background-color: rgb(78, 255, 72); -fx-padding:20");
        hButton4.setStyle("-fx-background-color: rgb(78, 255, 72); -fx-padding:20");
        hButton5.setStyle("-fx-background-color: rgb(78, 255, 72); -fx-padding:20");
        hButton6.setStyle("-fx-background-color: rgb(250, 253, 250); -fx-padding:20");


        Label hLabel1 = new Label("4");
        Label hLabel2 = new Label("4");
        Label hLabel3 = new Label("3");
        Label hLabel4 = new Label("2");
        Label hLabel5 = new Label("9");
        Label hLabel6 = new Label("5");
        hLabel1.setPrefSize(200, 90);
        hLabel2.setPrefSize(200, 90);
        hLabel3.setPrefSize(200, 90);
        hLabel4.setPrefSize(200, 90);
        hLabel5.setPrefSize(200, 90);
        hLabel6.setPrefSize(1300, 210);

        hLabel1.setAlignment(Pos.CENTER);
        hLabel2.setAlignment(Pos.CENTER);
        hLabel3.setAlignment(Pos.CENTER);
        hLabel4.setAlignment(Pos.CENTER);
        hLabel5.setAlignment(Pos.CENTER);
        hLabel6.setAlignment(Pos.CENTER);

        hLabel1.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(78, 255, 72); -fx-font-weight:Bold");
        hLabel2.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(78, 255, 72); -fx-font-weight:Bold");
        hLabel3.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(78, 255, 72); -fx-font-weight:Bold");
        hLabel4.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(78, 255, 72); -fx-font-weight:Bold");
        hLabel5.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(78, 255, 72); -fx-font-weight:Bold");
        hLabel6.setStyle("-fx-font-size: 25px; -fx-background-color: rgb(243, 247, 243); -fx-font-weight:Bold");
        
        HBox homeTitleTagButton = new HBox(20,hButton1,hButton2,hButton3,hButton4,hButton5);
        HBox homeTitleTagLabel  = new HBox(20,hLabel1,hLabel2,hLabel3,hLabel4,hLabel5);
        VBox homeLatestBook= new VBox(hButton6,hLabel6);
        VBox homeTitle = new VBox(homeTitleTagButton,homeTitleTagLabel);
        VBox homeFinal = new VBox(300,homeTitle,homeLatestBook);
        rightPanel.getChildren().add(homeFinal);
        //============End Home Button==================
        //==========Start AddBook Button ==============
        Button addBookToList = new Button("Add");
        Button removeBook = new Button("Remove");
        addBookToList.setPrefSize(300, 50);
        removeBook.setPrefSize(477, 50);
        //label's
        Label labelRemindList = new Label("List of Book's that You wont to add");
        Label label1 = new Label("Book Title:");
        Label label2 = new Label("Book Author:");
        Label label3 = new Label("Book ISBN:");
        Label label4 = new Label("Adding Date");
        labelRemindList.setPrefSize(478, 60);
        label1.setPrefSize(100, 50);
        label2.setPrefSize(100, 50);
        label3.setPrefSize(100, 50);
        label4.setPrefSize(100, 50);
        labelRemindList.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-padding:23;-fx-font-weight:Bold;");
        label1.setStyle("-fx-font-weight:Bold;");
        label2.setStyle("-fx-font-weight:Bold;");
        label3.setStyle("-fx-font-weight:Bold;");
        label4.setStyle("-fx-font-weight:Bold;");
        //Field
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        textField1.setPrefSize(200, 50);
        textField2.setPrefSize(200, 50);
        textField3.setPrefSize(200, 50);
        textField4.setPrefSize(200, 50);
        textField1.setStyle("-fx-font-weight:Bold;");
        textField2.setStyle("-fx-font-weight:Bold;");
        textField3.setStyle("-fx-font-weight:Bold;");
        textField4.setStyle("-fx-font-weight:Bold;");

        //TextArea
        TextArea bookList = new TextArea();
        bookList.setPrefSize(20, 400);
        bookList.setWrapText(true);
        String header = String.format("%-30s %-30s %-30s %-30s", "Title", "Author", "ISBN", "Date");
        bookList.setText(header + "\n-----------------------------------------------------------------------------------------------\n");

        
        addBookToList.setOnAction(event -> {
            String title =  textField1.getText();
            String author = textField2.getText();
            String isbn =   textField3.getText();
            String date = textField4.getText();
             if (!title.isEmpty() && !author.isEmpty() && !isbn.isEmpty()) {
                if (title != bookList.getText()) {
                    textField1.setText(null);
                    textField2.setText(null);
                    textField3.setText(null);
                    textField4.setText(null);
                    bookList.appendText(title + "\t\t\t\t" + author + "\t\t\t\t" + isbn + "\t\t\t\t" + date + "\n");
                    Book book = new Book(title,author,isbn,date);
                    library.addBook(book);
                }
                else{
                    JOptionPane.showMessageDialog(null, "This Book is Alridy Addid ");
                }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Enter All Datel of Book", "Warning", JOptionPane.WARNING_MESSAGE);
                }
        });
        removeBook.setOnAction(event -> {
            String text = bookList.getText();
            int caretPosition = bookList.getCaretPosition();
            String[] lines = text.split("\n");

            int lineIndex = text.substring(0, caretPosition).split("\n").length - 1; // Find the line number

            if (lineIndex >= 0 && lineIndex < lines.length) {
                StringBuilder newText = new StringBuilder();
                for (int i = 0; i < lines.length; i++) {
                    if (i != lineIndex) {
                        newText.append(lines[i]).append("\n");
                    }
                }
                bookList.setText(newText.toString().trim());
            }
        });
        //Button (Add Book) Atributs:
        HBox addbookH1 = new HBox(10,label1,textField1);
        HBox addbookH2 = new HBox(10,label2,textField2);
        HBox addbookH3 = new HBox(10,label3,textField3);
        HBox addbookH4 = new HBox(10,label4,textField4);
        HBox addbookH5 = new HBox(addBookToList);
        VBox addBookDi = new VBox(10,labelRemindList,bookList,removeBook);
        VBox addBook = new VBox(10,addbookH1,addbookH2,addbookH3,addbookH4,addbookH5);
        HBox addButtonFinal = new HBox(200,addBook,addBookDi);
        //=========End AddBook Button====================
        //=========Start Book Datel=============
        
        //=========End Book Datel===============
        //=========Start DisplayBook Button===============
      
        // for(Book book : books){
           
        // }
        // Label label = new Label("booksetTitle");
        // VBox disPlayFinal = new VBox(label);

        //=========End DisplayBook Button=================
        //=========Start UserDatel Button===============
        Button addUser = new Button("Add");
        Button removeListUser = new Button("Remove");
        addUser.setPrefSize(300, 50);
        removeListUser.setPrefSize(477, 50);

        Label labelUserList = new Label("List of User's that You wont to add");
        Label ulabel1 = new Label("User Name");
        Label ulabel2 = new Label("Father Name");
        Label ulabel3 = new Label("Usere ID");
        labelUserList.setPrefSize(478, 60);
        ulabel1.setPrefSize(100, 50);
        ulabel2.setPrefSize(100, 50);
        ulabel3.setPrefSize(100, 50);
        labelUserList.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-padding:23;-fx-font-weight:Bold;");
        ulabel1.setStyle("-fx-font-weight:Bold;");
        ulabel2.setStyle("-fx-font-weight:Bold;");
        ulabel3.setStyle("-fx-font-weight:Bold;");
        //Field
        TextField utextField1 = new TextField();
        TextField utextField2 = new TextField();
        TextField utextField3 = new TextField();
        utextField1.setPrefSize(200, 50);
        utextField2.setPrefSize(200, 50);
        utextField3.setPrefSize(200, 50);
        utextField1.setStyle("-fx-font-weight:Bold;");
        utextField2.setStyle("-fx-font-weight:Bold;");
        utextField3.setStyle("-fx-font-weight:Bold;");

        CheckBox checkBox1 = new CheckBox("Admin");
        CheckBox checkBox2 = new CheckBox("Student");
        CheckBox checkBox3 = new CheckBox("Stife");
        checkBox1.setPrefSize(100, 50);
        checkBox2.setPrefSize(100, 50);
        checkBox3.setPrefSize(100, 50);
        checkBox1.setOnAction(e -> {
            if (checkBox1.isSelected()) {
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox2.setOnAction(e -> {
            if (checkBox2.isSelected()) {
                checkBox1.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox3.setOnAction(e -> {
            if (checkBox3.isSelected()) {
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);
            }
        });

        //TextArea
        TextArea userList = new TextArea();
        userList.setPrefSize(20, 400);
        userList.setWrapText(true);
        String uheader = String.format("%-30s %-30s %-30s %-30s", "Name", "Father", "ID", "Type");
        userList.setText(uheader + "\n--------------------------------------------------------------------------------------------\n");

        addUser.setOnAction(event -> {
            String userName  = utextField1.getText();
            String faterName = utextField2.getText();
            String userID    = utextField3.getText();
            String accountType;
            if (checkBox1.isSelected()) {
                accountType = "Admin";
            }
            else if (checkBox2.isSelected()) {
                accountType = "Student";
            } else {
                accountType = "Stife";
            }
             if (!userName.isEmpty() && !faterName.isEmpty() && !userID.isEmpty()) {
                if (userName != userList.getText()) {
                    utextField1.setText(null);
                    utextField2.setText(null);
                    utextField3.setText(null);
                    userList.appendText(userName + "\t\t\t\t" + faterName + "\t\t\t\t" + userID + "\t\t\t" + accountType + "\n");
                    User user = new User(userName, null);
                }
                else{
                    JOptionPane.showMessageDialog(null, "This User is Alridy Addid ");
                }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Enter All User Datel", "Warning", JOptionPane.WARNING_MESSAGE);
                }
        });
        removeListUser.setOnAction(event ->{
            String text = userList.getText();
            int caretPosition = userList.getCaretPosition();
            String[] lines = text.split("\n");

            int lineIndex = text.substring(0, caretPosition).split("\n").length - 1; // Find the line number

            if (lineIndex >= 0 && lineIndex < lines.length) {
                StringBuilder newText = new StringBuilder();
                for (int i = 0; i < lines.length; i++) {
                    if (i != lineIndex) {
                        newText.append(lines[i]).append("\n");
                    }
                }
                userList.setText(newText.toString().trim()); // Set updated text
            }
        });
       
        HBox addUser1 = new HBox(10,ulabel1,utextField1);
        HBox addUser2 = new HBox(10,ulabel2,utextField2);
        HBox addUser3 = new HBox(10,ulabel3,utextField3);
        HBox chackBox = new HBox(checkBox1,checkBox2,checkBox3);
        HBox addUser4 = new HBox(chackBox);
        HBox addUser5 = new HBox(addUser);
        VBox addUser6 = new VBox(10,labelUserList,userList,removeListUser);
        VBox addUser7 = new VBox(10,addUser1,addUser2,addUser3,addUser4,addUser5);
        HBox finalUserBox = new HBox(200,addUser6,addUser7);

        //=========End UserDatel Button=================
        //=========Start BorrowedBook Button===============
        Button addBorrowed = new Button("Add Book");
        Button removeListBorrowed = new Button("Remove Book");
        Button finalBorrowed = new Button("Final Books");
        addBorrowed.setPrefSize(300, 50);
        removeListBorrowed.setPrefSize(300, 50);
        finalBorrowed.setPrefSize(300, 50);

        //Label's
        Label labelBorrowedList = new Label("List of User's Name and Book Name that You wont to add");
        labelBorrowedList.setPrefSize(908, 60);
        labelBorrowedList.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-padding:23;-fx-font-weight:Bold;");
        Label blabel1 = new Label("User Name");
        Label blabel2 = new Label("Usere ID");
        Label blabel3 = new Label("Account Type");
        Label blabel4 = new Label("Book Name");
        Label blabel5 = new Label("Author Name");
        Label blabel6 = new Label("Book ISBN");
        Label blabel7 = new Label("Borrow Date");
        Label blabel8 = new Label("return Date");
        blabel1.setPrefSize(100,50);
        blabel2.setPrefSize(100,50);
        blabel3.setPrefSize(100,50);
        blabel4.setPrefSize(100,50);
        blabel5.setPrefSize(100,50);
        blabel6.setPrefSize(100,50);
        blabel7.setPrefSize(100,50);
        blabel8.setPrefSize(100,50);
        blabel1.setStyle("-fx-font-weight:Bold");
        blabel2.setStyle("-fx-font-weight:Bold");
        blabel3.setStyle("-fx-font-weight:Bold");
        blabel4.setStyle("-fx-font-weight:Bold");
        blabel5.setStyle("-fx-font-weight:Bold");
        blabel6.setStyle("-fx-font-weight:Bold");
        blabel7.setStyle("-fx-font-weight:Bold");
        blabel8.setStyle("-fx-font-weight:Bold");
        //TextArea
        TextArea borrowedList = new TextArea();
        borrowedList.setPrefSize(900, 350);
        //Field
        TextField btextField1 = new TextField();
        TextField btextField2 = new TextField();
        TextField btextField3 = new TextField();
        TextField btextField4 = new TextField();
        TextField btextField5 = new TextField();
        TextField btextField6 = new TextField();
        TextField btextField7 = new TextField();
        TextField btextField8 = new TextField();

        btextField1.setPrefSize(200, 50);
        btextField2.setPrefSize(200, 50);
        btextField3.setPrefSize(200, 50);
        btextField4.setPrefSize(200, 50);
        btextField5.setPrefSize(200, 50);
        btextField6.setPrefSize(200, 50);
        btextField7.setPrefSize(200, 50);
        btextField8.setPrefSize(200, 50);

        btextField1.setStyle("-fx-font-weight:Bold");
        btextField2.setStyle("-fx-font-weight:Bold");
        btextField3.setStyle("-fx-font-weight:Bold");
        btextField4.setStyle("-fx-font-weight:Bold");
        btextField5.setStyle("-fx-font-weight:Bold");
        btextField6.setStyle("-fx-font-weight:Bold");
        btextField7.setStyle("-fx-font-weight:Bold");
        btextField8.setStyle("-fx-font-weight:Bold");
        addBorrowed.setOnAction(event -> {
            String username = btextField1.getText();
            String userid   = btextField2.getText();
            String userty   = btextField3.getText();
            String bookname = btextField4.getText();
            String authorname= btextField5.getText();
            String bookid   = btextField6.getText();
            String isdate   = btextField7.getText();
            String redate   = btextField6.getText();
             if (!username.isEmpty() && !userid.isEmpty() && !userty.isEmpty()) {
                if (!bookname.isEmpty() && !authorname.isEmpty() && !bookid.isEmpty()) {
                    if (!isdate.isEmpty() && !redate.isEmpty()) {
                        btextField1.setText(null);
                        btextField2.setText(null);
                        btextField3.setText(null);
                        btextField4.setText(null);
                        btextField5.setText(null);
                        btextField6.setText(null);
                        btextField7.setText(null);
                        btextField8.setText(null);
                        borrowedList.appendText(username + "\t\t\t\t" + userid + "\t\t\t\t\t" + userty + "\t\t\t\t" + bookname +"\t\t\t\t" + authorname + "\t\t\t\t\t" + bookid + "\t\t\t\t" + isdate + " to " + redate +"\n");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "All Detal is valide But Borrow and return is missing","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "User Datel is right but book Datel is missing ","Warning",JOptionPane.WARNING_MESSAGE);
                }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "First Enter User Datel them other", "Warning", JOptionPane.WARNING_MESSAGE);
                }
        });
        removeListBorrowed.setOnAction(event -> {
            String text = borrowedList.getText();
            int caretPosition = borrowedList.getCaretPosition();
            String[] lines = text.split("\n");

            int lineIndex = text.substring(0, caretPosition).split("\n").length - 1; // Find the line number

            if (lineIndex >= 0 && lineIndex < lines.length) {
                StringBuilder newText = new StringBuilder();
                for (int i = 0; i < lines.length; i++) {
                    if (i != lineIndex) {
                        newText.append(lines[i]).append("\n");
                    }
                }
                borrowedList.setText(newText.toString().trim()); // Set updated text
            }
        });
        finalBorrowed.setOnAction(event -> {

        });
        HBox addBorrowed1 = new HBox(10,blabel1,btextField1);
        HBox addBorrowed2 = new HBox(10,blabel2,btextField2);
        HBox addBorrowed3 = new HBox(10,blabel3,btextField3);
        HBox addBorrowed4 = new HBox(10,blabel4,btextField4);
        HBox addBorrowed5 = new HBox(10,blabel5,btextField5);
        HBox addBorrowed6 = new HBox(10,blabel6,btextField6);
        HBox addBorrowed7 = new HBox(10,blabel7,btextField7);
        HBox addBorrowed8 = new HBox(10,blabel8,btextField8);
        VBox addButBorr = new VBox(10,addBorrowed,removeListBorrowed,finalBorrowed);
        VBox vBorrowedBox1 = new VBox(10,addBorrowed1,addBorrowed2,addBorrowed3);
        VBox vBorrowedBox2 = new VBox(10,addBorrowed4,addBorrowed5,addBorrowed6);
        VBox vBorrowedBox3 = new VBox(10,addBorrowed7,addBorrowed8);
        HBox hBorrowedBox1= new HBox(20,vBorrowedBox1,vBorrowedBox2,vBorrowedBox3);
        VBox hBorrowedBox2= new VBox(labelBorrowedList,borrowedList);
        HBox hBorrowedList= new HBox(40,hBorrowedBox2,addButBorr);
        VBox finalBorrowedTag = new VBox(40,hBorrowedBox1,hBorrowedList);
        //=========End BorrowedBook Button=================
        //=========Start Themes Settings Button===============
        //Label's
        Label tLabel1 = new Label("Title Bare Color's");
        Label tLabel2 = new Label("Left Button Screen Color's");
        Label tLabel3 = new Label("Right Manule Screen Color's");
        tLabel1.setAlignment(Pos.CENTER);
        tLabel2.setAlignment(Pos.CENTER);
        tLabel3.setAlignment(Pos.CENTER);
        tLabel1.setStyle("-fx-font-weight:Bold; -fx-padding:20");
        tLabel2.setStyle("-fx-font-weight:Bold; -fx-padding:20");
        tLabel3.setStyle("-fx-font-weight:Bold; -fx-padding:20");
        //Button's
        Button tButton1 = new Button("Red");
        Button tButton2 = new Button("Black");
        Button tButton3 = new Button("Orange");
        Button tButton4 = new Button("Yellow");
        Button tButton5 = new Button("White");
        Button tButton6 = new Button("Green");
        Button tButton7 = new Button("Blue");
        Button tButton8 = new Button("Purple");
        Button tButton9 = new Button("Pink");

        Button t2Button1 = new Button("Red");
        Button t2Button2 = new Button("Black");
        Button t2Button3 = new Button("Orange");
        Button t2Button4 = new Button("Yellow");
        Button t2Button5 = new Button("White");
        Button t2Button6 = new Button("Green");
        Button t2Button7 = new Button("Blue");
        Button t2Button8 = new Button("Purple");
        Button t2Button9 = new Button("Pink");

        Button t3Button1 = new Button("Red");
        Button t3Button2 = new Button("Black");
        Button t3Button3 = new Button("Orange");
        Button t3Button4 = new Button("Yellow");
        Button t3Button5 = new Button("White");
        Button t3Button6 = new Button("Green");
        Button t3Button7 = new Button("Blue");
        Button t3Button8 = new Button("Purple");
        Button t3Button9 = new Button("Pink");

        //Button Size
        tButton1.setPrefSize(100, 50);
        tButton2.setPrefSize(100, 50);
        tButton3.setPrefSize(100, 50);
        tButton4.setPrefSize(100, 50);
        tButton5.setPrefSize(100, 50);
        tButton6.setPrefSize(100, 50);
        tButton7.setPrefSize(100, 50);
        tButton8.setPrefSize(100, 50);
        tButton9.setPrefSize(100, 50);

        t2Button1.setPrefSize(100, 50);
        t2Button2.setPrefSize(100, 50);
        t2Button3.setPrefSize(100, 50);
        t2Button4.setPrefSize(100, 50);
        t2Button5.setPrefSize(100, 50);
        t2Button6.setPrefSize(100, 50);
        t2Button7.setPrefSize(100, 50);
        t2Button8.setPrefSize(100, 50);
        t2Button9.setPrefSize(100, 50);

        t3Button1.setPrefSize(100, 50);
        t3Button2.setPrefSize(100, 50);
        t3Button3.setPrefSize(100, 50);
        t3Button4.setPrefSize(100, 50);
        t3Button5.setPrefSize(100, 50);
        t3Button6.setPrefSize(100, 50);
        t3Button7.setPrefSize(100, 50);
        t3Button8.setPrefSize(100, 50);
        t3Button9.setPrefSize(100, 50);

        //Button Alignment
        tButton1.setAlignment(Pos.CENTER);
        tButton2.setAlignment(Pos.CENTER);
        tButton3.setAlignment(Pos.CENTER);
        tButton4.setAlignment(Pos.CENTER);
        tButton5.setAlignment(Pos.CENTER);
        tButton6.setAlignment(Pos.CENTER);
        tButton7.setAlignment(Pos.CENTER);
        tButton8.setAlignment(Pos.CENTER);
        tButton9.setAlignment(Pos.CENTER);

        t2Button1.setAlignment(Pos.CENTER);
        t2Button2.setAlignment(Pos.CENTER);
        t2Button3.setAlignment(Pos.CENTER);
        t2Button4.setAlignment(Pos.CENTER);
        t2Button5.setAlignment(Pos.CENTER);
        t2Button6.setAlignment(Pos.CENTER);
        t2Button7.setAlignment(Pos.CENTER);
        t2Button8.setAlignment(Pos.CENTER);
        t2Button9.setAlignment(Pos.CENTER);

        t3Button1.setAlignment(Pos.CENTER);
        t3Button2.setAlignment(Pos.CENTER);
        t3Button3.setAlignment(Pos.CENTER);
        t3Button4.setAlignment(Pos.CENTER);
        t3Button5.setAlignment(Pos.CENTER);
        t3Button6.setAlignment(Pos.CENTER);
        t3Button7.setAlignment(Pos.CENTER);
        t3Button8.setAlignment(Pos.CENTER);
        t3Button9.setAlignment(Pos.CENTER);

        //Button Style
        tButton1.setStyle("-fx-background-color:rgb(247, 0, 0); -fx-text-fill:Black; -fx-font-weight:Bold");
        tButton2.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-text-fill:white; -fx-font-weight:Bold");
        tButton3.setStyle("-fx-background-color:rgb(255, 150, 12); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton4.setStyle("-fx-background-color:rgb(236, 224, 52); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton5.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton6.setStyle("-fx-background-color:rgb(32, 253, 3); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton7.setStyle("-fx-background-color:rgb(0, 102, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton8.setStyle("-fx-background-color:rgb(195, 0, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        tButton9.setStyle("-fx-background-color:rgb(247, 2, 194); -fx-text-fill:black; -fx-font-weight:Bold");

        t2Button1.setStyle("-fx-background-color:rgb(247, 0, 0); -fx-text-fill:Black; -fx-font-weight:Bold");
        t2Button2.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-text-fill:white; -fx-font-weight:Bold");
        t2Button3.setStyle("-fx-background-color:rgb(255, 150, 12); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button4.setStyle("-fx-background-color:rgb(236, 224, 52); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button5.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button6.setStyle("-fx-background-color:rgb(32, 253, 3); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button7.setStyle("-fx-background-color:rgb(0, 102, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button8.setStyle("-fx-background-color:rgb(195, 0, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t2Button9.setStyle("-fx-background-color:rgb(247, 2, 194); -fx-text-fill:black; -fx-font-weight:Bold");

        t3Button1.setStyle("-fx-background-color:rgb(247, 0, 0); -fx-text-fill:Black; -fx-font-weight:Bold");
        t3Button2.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-text-fill:white; -fx-font-weight:Bold");
        t3Button3.setStyle("-fx-background-color:rgb(255, 150, 12); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button4.setStyle("-fx-background-color:rgb(236, 224, 52); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button5.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button6.setStyle("-fx-background-color:rgb(32, 253, 3); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button7.setStyle("-fx-background-color:rgb(0, 102, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button8.setStyle("-fx-background-color:rgb(195, 0, 255); -fx-text-fill:black; -fx-font-weight:Bold");
        t3Button9.setStyle("-fx-background-color:rgb(247, 2, 194); -fx-text-fill:black; -fx-font-weight:Bold");

        //Button event's
        tButton1.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(247, 0, 0)");
        });
        tButton2.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(39, 39, 39)");
        });
        tButton3.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color:rgb(255, 150, 12)");
        });
        tButton4.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(236, 224, 52)");
        });
        tButton5.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(255, 255, 255)");
        });
        tButton6.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color:rgb(32, 253, 3)");
        });
        tButton7.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(0, 102, 255)");
        });
        tButton8.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color: rgb(195, 0, 255)");
        });
        tButton9.setOnAction(event -> {
            layoutS.setStyle("-fx-background-color:rgb(247, 27, 199)");
        });

        //Tag2
        t2Button1.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(247, 0, 0); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:black; -fx-text-fill:red");
        });
        t2Button2.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button3.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(255, 150, 12); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button4.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(236, 224, 52); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button5.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button6.setOnAction(event -> {
            leftPanel.setStyle(" -fx-background-color:rgb(32, 253, 3); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button7.setOnAction(event -> {
            leftPanel.setStyle(" -fx-background-color:rgb(0, 102, 255); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button8.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(195, 0, 255); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        t2Button9.setOnAction(event -> {
            leftPanel.setStyle("-fx-background-color:rgb(247, 27, 199); -fx-padding: 20;");
            exitButton.setStyle("-fx-background-color:red; -fx-text-fill:black");
        });
        //Tag3
        t3Button1.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(247, 0, 0); -fx-padding:20");
        });
        t3Button2.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(39, 39, 39); -fx-padding:20");
        });
        t3Button3.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(255, 150, 12); -fx-padding:20");
        });
        t3Button4.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(236, 224, 52); -fx-padding:20");
        });
        t3Button5.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(255, 255, 255); -fx-padding:20");
        });
        t3Button6.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(32, 253, 3); -fx-padding:20");
        });
        t3Button7.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(0, 102, 255); -fx-padding:20");
        });
        t3Button8.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(195, 0, 255); -fx-padding:20");
        });
        t3Button9.setOnAction(event -> {
            rightPanel.setStyle("-fx-background-color:rgb(247, 27, 199); -fx-padding:20");
        });
        HBox themesTag1 = new HBox(10,tLabel1,tButton1,tButton2,tButton3,tButton4,tButton5,tButton6,tButton7,tButton8,tButton9);
        HBox themesTag2 = new HBox(10,tLabel2,t2Button1,t2Button2,t2Button3,t2Button4,t2Button5,t2Button6,t2Button7,t2Button8,t2Button9);
        HBox themesTag3 = new HBox(10,tLabel3,t3Button1,t3Button2,t3Button3,t3Button4,t3Button5,t3Button6,t3Button7,t3Button8,t3Button9);
        themesTag1.setStyle("-fx-background-color:rgb(128, 190, 241); -fx-padding:20");
        themesTag2.setStyle("-fx-background-color:rgb(128, 190, 241); -fx-padding:20");
        themesTag3.setStyle("-fx-background-color:rgb(128, 190, 241); -fx-padding:20");
        VBox themesFinal = new VBox(10,themesTag1,themesTag2,themesTag3);
        //=========End Themes Settings Button=================
    
        //leftFram Button event's
        home.setOnAction(event -> {
            rightPanel.getChildren().clear();
            rightPanel.getChildren().add(homeFinal);
            layout.setCenter(rightPanel);
        });
        button.setOnAction(event -> {
        rightPanel.getChildren().clear();
        rightPanel.getChildren().add(addButtonFinal);
        layout.setCenter(rightPanel);
        
        });
        button2.setOnAction(event -> {
           
        });
        button3.setOnAction(event -> {
            // rightPanel.getChildren().clear();
            // rightPanel.getChildren().add(disPlayFinal);
            // layout.setCenter(rightPanel);
            // library.displayBooks();
        });
        button4.setOnAction(event -> {
            rightPanel.getChildren().clear();
            rightPanel.getChildren().add(finalUserBox);
            layout.setCenter(rightPanel);
        });
        button5.setOnAction(event -> {
            rightPanel.getChildren().clear();
            rightPanel.getChildren().add(finalBorrowedTag);
            layout.setCenter(rightPanel);
        });
        button6.setOnAction(event -> {
            rightPanel.getChildren().clear();
            rightPanel.getChildren().add(themesFinal);
            layout.setCenter(rightPanel);
        });
        exitButton.setOnAction(event -> {
            window.close();
        });
        layoutS.getChildren().add(labelLMS);
        layout.setTop(layoutS);
        leftPanel.getChildren().addAll(account,home,button,button2,button3,button4,button5,button6,exitButton);
        layout.setLeft(leftPanel);
        layout.setCenter(rightPanel);
  
  Scene scene = new Scene(layout, 1500, 800);
  
  window.setTitle("Library Menagment System");
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        Application.launch(args);

        // Book book1 = new Book("Java Programming", "James Gosling", "123456","2/23/25");
        // Book book2 = new Book("Python Basics", "Guido van Rossum", "789012","2/23/25");

        // User user1 = new User("Alice", "102");
        // User user2 = new User("Bob", "102");

        // Library library = new Library();

        // library.addBook(book1);
        // library.addBook(book2);
        // library.registerUser(user1);
        // library.registerUser(user2);

        // // Display initial data
        // library.displayBooks();
        // library.displayUsers();

        // // Borrow and return books
        // library.issueBook(user1, book1);
        // library.issueBook(user2, book2);
        // library.returnBook(user1, book1);

        // // Display final data
        // library.displayBooks();
        // library.displayUsers();
        

    }
}

