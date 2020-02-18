##

### Swiss Knife

##Modules of Project:

# Paint Challenge:

A paint application is made as a challenge to draw the image shown in the background. The background image is the icon of Swiss Knife. The given tools are drawing pencil, color palette and an eraser. It also has a secret which user has to find out.

# Scientific Calculator:

This calculator includes all the functions of a scientific calculator. The way this calculator works is different from regular calculators and it is much easier than regular calculators. It is fast and reliable.

# Tic tac toe game:

Tic Tac Toe game is made using the graphical user interface. The entire game board is composed of images and this game also includes sound effects. The O&#39;s and X&#39;s also images.

## Paint APP:

#Implementation:

1. JFrame is used to make the main panel on which all the drawing is done. It&#39;s only function is to contain the title and contain the drawing board. It also includes the close and minimize option.
2. JPanel is used to make the drawing board. Only one JPanel is used in the app which is placed inside the JFrame made in the first place. It contains the drawing canvas and color palette. All the drawing is done on it. JPanel is added to JFrame using the constructor and background is also added in the constructor.
3. PainComponent(Graphics g) function is used to draw the canvas and the color palette. It is also used to draw the borders of the canvas. The logo of eraser is also made in this function.
4. In this app, mouse is used to draw therefore MouseListener interface is implemented. It has four methods, of which only three are used: MousePressed, MouseReleased and MouseDragged. The Booleans are used to determine at which point the mouse is at a certain position.
5. Mouse drag is enabled and disabled using the Boolean.
6. The mouse drag function contains the algorithm to draw the line in paint canvas.
7. There are four variables to draw the line. Two variable contain the previous position of mouse while it is being dragged and the next two variables contain next position. These variables are updated dynamically during mouse dragging. It makes the drawing possible.
8. The color palette is detected using the coordinates of mouse pointer.
9. The eraser implements a white oval. When it is dragged, it draws a white oval wherever it is dragged to erase underneath it.
10. The background image is added using file handling. It&#39;s opacity is reduced to for the challenge.
11. Finally the app is compiled to a standalone application .jar file using the Eclipse Compiler.

## Scientific calculator:

#implementation:

1. JFrame is used to make the main panel which contains the panels for all the buttons and operation. It also contains the close and minimize operation.
2. Layout system is used in this application. The main JPanel layout is the **Border Layout system.**
3. Two JPanels are added the main JPanel. First JPanel contains three JTextFields. The layout used in this specific JPanel is **Grid Layout System.** The grid is of 3 x 0. The size of JTextFields are increased using setPrefferedSize method and Dimension class. The size of font and type of font is changed using the Font class and setFont method.
4. The Result is displayed using the JLabel. It&#39;s foreground color and background colors are changed. The font is also changed. It is set to be opaque. It is added to the main JPanel.
5. The buttons are added in a separate JPanel called buttonPanel. The spacing of the buttons is set to be 5 pixels. The **Grid Layout System** is used to arrange the buttons in order in this JPanel.
6. Finally the JTextFields, Buttons and Result field are added to the main JPanel which contains the border layout system.
7. The colors of buttons in buttonpanel are changed and foreground color is also changed. There are different colors for different categories of buttons. The fonts of these buttons are also changed.
8. The buttons are made actionable using the ActionListener. For number buttons and decimal point, A nested class is used to implement actionlistener. For the rest of the buttons, main class actionlistener is used to implement events. The ActionPerformed method is used to define whatever happens when a certain button is pressed.
9. Global variables are used to get X and Y number. These numbers are calculated according to the clicked arithmetic operation in the ActionPerformed method. The result is also a global variable. Global variables are used to transfer same variables along different methods and classes.
10. An algorithm is developed and implemented to make the number buttons usable for textfield using the mouse buttons.
11. An algorithm is developed and implemented to use the memory function of calculator. Whatever is the result becomes the X number so that if user wants to make any calculation in the result, it is readily possible.
12. Finally, the application is compiled to a .jar file using the Eclipse compiler.
13. The screenshot is in the next page.

## Tic tac toe game:

#Implementation:

1. A JFrame is made to make the main panel which contains title, close operation, minimize operation and the JPanel for the game. The function of this JFrame is only to contain the game panel.
2. Using constructor, the JPanel is added to the JFrame and background is set to be white.
3. File handling is used to add images to the game. The images added are the background (Swiss Knife blue Icon), X&#39;s symbol and O&#39;s symbol. These symbols are drawn using Photoshop.
4. Using paintComponent(Graphics g) function, the lines are drawn to divide the game panel to nine boxes. These nine boxes will serve as the nine drawing boards of the game which will contain O&#39;s and X&#39;s.
5. The MouseListener is implemented. Two of the four functions are used in the game; MousePressed and MouseReleased function.
6. The coordinates of the mouse are imported everytime button is clicked.
7. These coordinates are used to check which of the nine boxes is clicked.
8. Two Booleans are used to check Player X or Player O is playing.
9. The Booleans are changed to true and false consecutively with every click and mouse released function.
10. If PlayerX Boolean is true, then X images are drawn with every click and O images are drawn when PlayerO Boolean is true.
11. In the MouseReleased function, the game winning conditions are checked.
12. Whenever a box is clicked and image is drawn, 1 is added to variable, with the condition only is that variable is already 0. Same condition is applied on both X and O images.
13. When mouse is released, it is checked if in any orientation, the sum of those variables is equal to three. Same happens for O and X images.
14. Whenever X or O wins, a line image is drawn (Which is also imported using file handling) in that orientation over the winning orientation of X or O images.
15. A counter variable is also used to calculate how many clicks are pressed.
16. If it is pressed nine times, which means are boxes are crowded and no one won, it is a tie condition.
17. JOptionPane is used to show the tie message and game is closed.
18. **Sound Effects** are imported using the file handling.
19. There are four Sound effects; Game starting, click pressing, game winning and game tie condition.
20. These events occur according to the respective events.
21. Finally game is compiled to .jar file using Eclipse compiler.
22. Screenshots are on the next page.
