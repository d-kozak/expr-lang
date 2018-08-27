package io.dkozak.expressions;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main class of the module. Starts the console,
 * reads the input, parses it and executes actions using the EvaluationListener.
 *
 * @author dkozak
 * @see EvaluatingListener
 */
public class Main {

    /**
     * Starts the console, reads the input, parses it and executes actions.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> context = new HashMap<>();
        ParseTreeWalker walker = new ParseTreeWalker();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ExpressionsParser parser = new ExpressionsParser(new CommonTokenStream(new ExpressionsLexer(new ANTLRInputStream(line))));
            ParseTree ast = parser.stat();
            walker.walk(new EvaluatingListener(context), ast);
        }

    }
}
