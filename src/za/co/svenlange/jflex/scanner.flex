import java.io.*;

%%
%class Scanner
%unicode
%line
%char 

%{ 
    static int wordCount = 0;
    static int lineCount = 0;
    static int spaceCount = 0;
    static int symbolCount = 0;

    public static void main(String... args) throws Exception {
            Scanner lexer = new Scanner(new FileReader("scanner.txt"));
            lexer.yylex();
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);
            System.out.println("Spaces: " + spaceCount);
            System.out.println("Symbols: " + symbolCount);
    }
%}

%type Object
word = [^ \t\n\r]+
symbol = [^ A-Za-z0-9\n]
space = [\ \r\t\f]+
newline = \n | \r | \n\r

%%
{symbol} {symbolCount++; System.out.println("Symbol: "+ yytext());}
{word} {wordCount++; System.out.println("Word: "+ yytext());}
{space} {spaceCount++;}
{newline} {lineCount++;}
