import processing.core.PApplet;

/**
 * Print the 8 differnt patterns in the 8 different regions in the canvas
 * @author: Preston Wong
 *
 */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 300;
    for(int intRow = 3; intRow < 300; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn+= 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

    int intX = 303;
    int intY = 303;
    
      for(int intRow = 313; intRow < 600; intRow+= 20){
        for(int intColumn = 303; intColumn < 600; intColumn+= 10){
          intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
          intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        } 
      } 
 
      for(int intRow = 303; intRow < 600; intRow+= 20){
        for(int intColumn = 303; intColumn < 600; intColumn+= 10){
          intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
          intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'
            
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);

    }
  }
}

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int intX = 0;
    int intY = 0;

    for(int intRow = 603; intRow < 900; intRow+= 10){
      for(int intColumn = 313; intColumn < 600; intColumn+= 20){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }

    for(int intRow = 603; intRow < 900; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn+= 20){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(0);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    int intX = 0;
    int intY = 0;

   for(int intRow = 903; intRow < 1200; intRow+= 10){
      for(int intColumn = 303; intColumn < 600; intColumn+= 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(0);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
    for(int intRow = 903; intRow < 1200; intRow+= 20){
      for(int intColumn = 313; intColumn < 600; intColumn+= 20){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

    int intX = 0;
    int intY = 0;
/*
    for(int intColumn = 3; intColumn <= 310 ; intColumn += 10){
      for(int intRow = 3; intRow < intColumn; intRow += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn - 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }    
*/
    for(int intRow = 300; intRow > 0; intRow -= 10){
      for(int intColumn = 0; intColumn < intRow; intColumn += 10){
        intX = intRow - 7;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn + 3; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }    
  }
  
  public void draw_section6(){

  int intX = 0;
  int intY = 0;

    for(int intColumn = 313; intColumn < 610 ; intColumn += 10){
      for(int intRow = 303; intRow < intColumn; intRow += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn - 310; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }    
  }

  public void draw_section7(){


    
  }
  
  public void draw_section8(){

  int intX = 0;
  int intY = 0;

    for(int intRow = 893; intRow < 1200; intRow += 10){
      for(int intColumn = 893; intColumn < intRow ; intColumn += 10){
        intX = intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = intColumn - 890; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
}
