// Generated from /home/dkozak/IdeaProjects/expressions/src/io/dkozak/expressions/Expressions.g4 by ANTLR 4.7
package io.dkozak.expressions;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionsLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            VAR = 10, INT = 11, WS = 12;
    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "VAR", "INT", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16C\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3" +
                    "\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13\64\n\13\r\13\16\13" +
                    "\65\3\f\6\f9\n\f\r\f\16\f:\3\r\6\r>\n\r\r\r\16\r?\3\r\3\r\2\2\16\3\3\5" +
                    "\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\5\2C\\aac|\3" +
                    "\2\62;\5\2\13\f\17\17\"\"\2E\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3" +
                    "\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2" +
                    "\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37" +
                    "\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17,\3\2\2\2\21.\3\2\2\2\23" +
                    "\60\3\2\2\2\25\63\3\2\2\2\278\3\2\2\2\31=\3\2\2\2\33\34\7?\2\2\34\4\3" +
                    "\2\2\2\35\36\7=\2\2\36\6\3\2\2\2\37 \7r\2\2 !\7t\2\2!\"\7k\2\2\"#\7p\2" +
                    "\2#$\7v\2\2$%\7\"\2\2%\b\3\2\2\2&\'\7*\2\2\'\n\3\2\2\2()\7+\2\2)\f\3\2" +
                    "\2\2*+\7,\2\2+\16\3\2\2\2,-\7\61\2\2-\20\3\2\2\2./\7-\2\2/\22\3\2\2\2" +
                    "\60\61\7/\2\2\61\24\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2" +
                    "\65\63\3\2\2\2\65\66\3\2\2\2\66\26\3\2\2\2\679\t\3\2\28\67\3\2\2\29:\3" +
                    "\2\2\2:8\3\2\2\2:;\3\2\2\2;\30\3\2\2\2<>\t\4\2\2=<\3\2\2\2>?\3\2\2\2?" +
                    "=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\b\r\2\2B\32\3\2\2\2\6\2\65:?\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'='", "';'", "'print '", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, "VAR", "INT",
            "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public ExpressionsLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Expressions.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}