package lang.ast;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "parser.beaver".
 */
public class LangParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short ID = 1;
		static public final short LP = 2;
		static public final short NUM = 3;
		static public final short ADD = 4;
		static public final short SUB = 5;
		static public final short TYPE = 6;
		static public final short RP = 7;
		static public final short RB = 8;
		static public final short SEMI = 9;
		static public final short IF = 10;
		static public final short WHILE = 11;
		static public final short RET = 12;
		static public final short LB = 13;
		static public final short MUL = 14;
		static public final short DIV = 15;
		static public final short MOD = 16;
		static public final short ASSIGN = 17;
		static public final short COMMA = 18;
		static public final short ELSE = 19;
		static public final short EQ = 20;
		static public final short NE = 21;
		static public final short LT = 22;
		static public final short GT = 23;
		static public final short GE = 24;
		static public final short LE = 25;

		static public final String[] NAMES = {
			"EOF",
			"ID",
			"LP",
			"NUM",
			"ADD",
			"SUB",
			"TYPE",
			"RP",
			"RB",
			"SEMI",
			"IF",
			"WHILE",
			"RET",
			"LB",
			"MUL",
			"DIV",
			"MOD",
			"ASSIGN",
			"COMMA",
			"ELSE",
			"EQ",
			"NE",
			"LT",
			"GT",
			"GE",
			"LE"
		};
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9orbSjpL4KKXtzt9cOI7ff8m4WCcS24419CCYGYe2W2Hi5e40GH0r5yK9ORtRYoIXUwroe" +
		"M$WCkt6bfwKAjignIyOKlLCJt0nKK5V4HK8$VxTkPzDpCMB3mLdttd5#Vqy$RtLUAxb91tL" +
		"gc1HhGUQfHIqddjLRhTBc6T8MkBClAwggINbGjoqpNE3qVNLErhJDqezEBqRLLi#fqizCNe" +
		"AUNPQtN72rHXtfKhpDrbhQfGMThbfhKgDjSjDbEQ9fc49qTHDlKwQ8vxTArSTH#gn0zHqLj" +
		"TNNFhH2DxKuNdQkPfUZvQjKANQHLkbIN1REua74c8#rJipROCTImRj1DzWNwQlj58ubMltg" +
		"3UlC2Vs7WBmtybO5$SU1V4lYh0tzDQImRwNlJv5Xq7NfpeAz7Rq5lzpgfTRj6bR7VrQuk3T" +
		"fBlZHvxt3hCgRbNhkSieof9QVvjgzT7obidB7UglHp2r#dXJtKoagsiSVQ0zt9$krYxtNJS" +
		"fZLUqfP2h9ggsP5GLQcQbOkoAgRaXLHCyiUoxFBu$DKO1KMukTTj9RQIzXtvT4QpbOSBR9J" +
		"acYkGhIUNPj4emhHs2RHnY2QOPVFTgUZcNDHFjTaf3d6rCWy8axUT4v8FJg3pdazmFSFw$q" +
		"VVbHQjLfwdXpBB7HVeElGCtbdl4vgzJBMVeZlb0RkdQHqeiLuNUBP93h92JEcbfpkkzxraI" +
		"PUrxob7hwWjFk#oHtVu$rLi0RkW0sm5Pw44Hz$rjjHRtV5TWAUExrzmDk7uI4OyteFF0Ntm" +
		"4afQe3syZQY0dH03yo7OggFHocRWtt2wtlHWzW7iTsmCiXznBV9l2Bc4gs6RR0MjiCGZC9w" +
		"s1dsa#hpCUB3s6VW1VmHxFDm34x0E1ptVTL01dB1d1fX4pH12qo31Jws1JR23XYhqFSHFjZ" +
		"XLDbmuAyB$FkhpU6$eFr3GHkF#xAZNZUb#dxQsyZRpWfZtfFIpmN#YWhvBtgxrzjztkxtzk" +
		"0fp64yQ6z6u6$sza1GLhPlVLbRuDyT#CL9FnfArTcT6FjRPO$z1J$1KVZHVh0ZsCFmFNm5N" +
		"zhdl0$0E$2QlMNxVCstuLLxmrwnbvq#wTw$shkyzzhhTjpUnFiGFe3tOJ#yPv$Pf$Q9VMm7" +
		"xIDDUUmx#zPxX#pdiiWt9UyF#zF#mLdkxgv#HuPRhSxTwiLu9IXRwiWgFd63#0EEB7U#8EB" +
		"cZybmzqyGUH9Tu4Ogq6OVRNRWn$#6lAE6lqMMVrfKbKxYYw0B5aCtz41ySxSvc#KkZpo9Fy" +
		"#HBT6AdWlB$WMRtLWe");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final boolean DEBUG = false;
	static public class SyntaxError extends RuntimeException { public SyntaxError(String msg) {super(msg);}}
	// Disable syntax error recovery
	protected void recoverFromError(Symbol token, TokenStream in) {
		throw new SyntaxError("Cannot recover from the syntax error");
	}

	private final Action[] actions;

	public LangParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] program = funcList.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					 return new Program(a);
				}
			},
			new Action() {	// [1] funcList = func.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Func a = (Func) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [2] funcList = funcList.a func.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Func b = (Func) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [3] func = TYPE ID.a LP argListOpt.b RP LB statListOpt.c RB
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 4];
					final List b = (List) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 7];
					final List c = (List) _symbol_c.value;
					 return new Func(a,b,c);
				}
			},
			new Action() {	// [4] funcCall = ID.a LP expListOpt.b RP
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					final Symbol _symbol_b = _symbols[offset + 3];
					final List b = (List) _symbol_b.value;
					 return new Fcall(a,b);
				}
			},
			new Action() {	// [5] argListOpt = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			Action.RETURN,	// [6] argListOpt = argList
			new Action() {	// [7] argList = decl.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [8] argList = argList.a COMMA decl.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final IdDecl b = (IdDecl) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [9] expListOpt = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			Action.RETURN,	// [10] expListOpt = expList
			new Action() {	// [11] expList = exp.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [12] expList = expList.a COMMA exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [13] statListOpt = 
				public Symbol reduce(Symbol[] _symbols, int offset) {
					 return new List();
				}
			},
			Action.RETURN,	// [14] statListOpt = statList
			new Action() {	// [15] statList = stat.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stat a = (Stat) _symbol_a.value;
					 return new List().add(a);
				}
			},
			new Action() {	// [16] statList = statList.a stat.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final List a = (List) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 2];
					final Stat b = (Stat) _symbol_b.value;
					 return a.add(b);
				}
			},
			new Action() {	// [17] stat = decl.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdDecl a = (IdDecl) _symbol_a.value;
					 return a;
				}
			},
			new Action() {	// [18] stat = assi.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Assi a = (Assi) _symbol_a.value;
					 return a;
				}
			},
			Action.RETURN,	// [19] stat = ifstat
			Action.RETURN,	// [20] stat = whilestat
			new Action() {	// [21] stat = retstat.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Stat a = (Stat) _symbol_a.value;
					 return a;
				}
			},
			new Action() {	// [22] stat = funcCall.a SEMI
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					 return a;
				}
			},
			new Action() {	// [23] ifstat = IF LP cmpexp.a RP LB statListOpt.b RB
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 6];
					final List b = (List) _symbol_b.value;
					 return new If(a,b,new Opt());
				}
			},
			new Action() {	// [24] ifstat = IF LP cmpexp.a RP LB statListOpt.b RB elsestat.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 6];
					final List b = (List) _symbol_b.value;
					final Symbol _symbol_c = _symbols[offset + 8];
					final Stat c = (Stat) _symbol_c.value;
					 return new If(a,b,new Opt(c));
				}
			},
			new Action() {	// [25] elsestat = ELSE LB statListOpt.a RB
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final List a = (List) _symbol_a.value;
					 return new Else(a);
				}
			},
			new Action() {	// [26] whilestat = WHILE LP cmpexp.a RP LB statListOpt.b RB
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 3];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 6];
					final List b = (List) _symbol_b.value;
					 return new While(a,b);
				}
			},
			new Action() {	// [27] retstat = RET cmpexp.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 2];
					final Expr a = (Expr) _symbol_a.value;
					 return new Ret(a);
				}
			},
			new Action() {	// [28] decl = TYPE ID.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 2];
					 return new IdDecl(a, new Opt());
				}
			},
			new Action() {	// [29] decl = TYPE ID.a ASSIGN cmpexp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 2];
					final Symbol _symbol_b = _symbols[offset + 4];
					final Expr b = (Expr) _symbol_b.value;
					 return new IdDecl(a, new Opt(b));
				}
			},
			new Action() {	// [30] assi = idUse.a ASSIGN cmpexp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final IdUse a = (IdUse) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Assi(a, b);
				}
			},
			Action.RETURN,	// [31] cmpexp = exp
			Action.RETURN,	// [32] cmpexp = eqexp
			Action.RETURN,	// [33] cmpexp = neexp
			Action.RETURN,	// [34] cmpexp = ltexp
			Action.RETURN,	// [35] cmpexp = gtexp
			Action.RETURN,	// [36] cmpexp = geexp
			Action.RETURN,	// [37] cmpexp = leexp
			new Action() {	// [38] eqexp = exp.a EQ exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new EqExp(a, b);
				}
			},
			new Action() {	// [39] neexp = exp.a NE exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new NeExp(a, b);
				}
			},
			new Action() {	// [40] ltexp = exp.a LT exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new LtExp(a, b);
				}
			},
			new Action() {	// [41] gtexp = exp.a GT exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new GtExp(a, b);
				}
			},
			new Action() {	// [42] geexp = exp.a GE exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new GeExp(a, b);
				}
			},
			new Action() {	// [43] leexp = exp.a LE exp.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					return new LeExp(a, b);
				}
			},
			Action.RETURN,	// [44] exp = term
			new Action() {	// [45] exp = exp.a ADD term.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Add(a, b);
				}
			},
			new Action() {	// [46] exp = exp.a SUB term.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Sub(a, b);
				}
			},
			Action.RETURN,	// [47] factor = num
			Action.RETURN,	// [48] factor = idUse
			RETURN2,	// [49] factor = LP exp.a RP
			Action.RETURN,	// [50] factor = funcCall
			Action.RETURN,	// [51] term = factor
			new Action() {	// [52] term = term.a MUL factor.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mul(a, b);
				}
			},
			new Action() {	// [53] term = term.a DIV factor.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Div(a, b);
				}
			},
			new Action() {	// [54] term = term.a MOD factor.b
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final Expr a = (Expr) _symbol_a.value;
					final Symbol _symbol_b = _symbols[offset + 3];
					final Expr b = (Expr) _symbol_b.value;
					 return new Mod(a, b);
				}
			},
			new Action() {	// [55] num = NUM.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new Num(a);
				}
			},
			new Action() {	// [56] idUse = ID.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol a = _symbols[offset + 1];
					 return new IdUse(a);
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}