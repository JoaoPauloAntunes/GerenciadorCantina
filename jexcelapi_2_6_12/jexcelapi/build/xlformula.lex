<<<<<<< HEAD
/*********************************************************************
*
*      Copyright (C) 2002 Andrew Khan
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
***************************************************************************/

package jxl.biff.formula;

/**
 * This file is generated by JLex.  Do not alter the contents of this file
 * because changes will be overridden
 */

import jxl.biff.WorkbookMethods;

%%

%{
  int getPos() { return yychar ; }
%}

%{
  private boolean emptyString;
%}

%{
  private ExternalSheet externalSheet;
  private WorkbookMethods nameTable;

  void setExternalSheet(ExternalSheet es)
  {
    externalSheet = es;
  }

  void setNameTable(WorkbookMethods nt)
  {
    nameTable = nt;
  }
%}

%yylexthrow{
 jxl.biff.formula.FormulaException
%yylexthrow}

%line
%char
%unicode
%type ParseItem
%state YYSTRING

ALPHA=[A-Za-z]
DIGIT=[0-9]
SYMBOL=[$!%^&*#_=+;#~@/?.,<>|:-\[\]\\]
RANGE_SEPARATOR=":"
ARGUMENT_SEPARATOR=","
OPEN_PARENTHESES="("
CLOSE_PARENTHESES=")"
INTEGER={DIGIT}+
FLOAT={DIGIT}+"."{DIGIT}+
NON_RELATIVE_CELL_IND="$"
BOOLEAN_TRUE="TRUE"
BOOLEAN_FALSE="FALSE"
QUOTE="\""
STRING=[^{QUOTE}]*
SINGLE_QUOTE="'"
CELL_REFERENCE={NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?{NON_RELATIVE_CELL_IND}?{INTEGER}
CELL_RANGE={CELL_REFERENCE}{RANGE_SEPARATOR}{CELL_REFERENCE}
SHEET_NAME={SINGLE_QUOTE}[^{SINGLE_QUOTE}]*{SINGLE_QUOTE}
COLUMN_RANGE={NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?{RANGE_SEPARATOR}{NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?
CELL_RANGE_3D={CELL_REFERENCE_3D}:{CELL_REFERENCE}
CELL_REFERENCE_3D={SHEET_NAME}!{CELL_REFERENCE}
CELL_REFERENCE_3D2=({ALPHA})+!{CELL_REFERENCE}
COLUMN_RANGE_3D={SHEET_NAME}!{COLUMN_RANGE}
NAME={ALPHA}({ALPHA}|{INTEGER}|_)*
WHITE_SPACE=[\n\ \t\b\012]
START_FUNCTION={ALPHA}+{OPEN_PARENTHESES}
ARG_LIST={NAME}
ARG={ALPHA}{ALPHA}({ALPHA}|{INTEGER})*
FUNCTION={START_FUNCTION}{ARG_LIST}?{CLOSE_PARENTHESES}
ERROR_CONSTANT="#NULL!"|"#DIV/0!"|"#VALUE!"|"#REF!"|"#NAME?"|"#NUM!"
%% 

<YYINITIAL> "+"  { return new Plus() ;}
<YYINITIAL> "-"  { return new Minus() ; }
<YYINITIAL> "*"  { return new Multiply() ; }
<YYINITIAL> "/"  { return new Divide() ; }
<YYINITIAL> ">"  { return new GreaterThan() ; }
<YYINITIAL> "="  { return new Equal() ; }
<YYINITIAL> ">=" { return new GreaterEqual() ; }
<YYINITIAL> "<"  { return new LessThan() ; }
<YYINITIAL> "<>" { return new NotEqual() ; }
<YYINITIAL> "<=" { return new LessEqual() ; }
<YYINITIAL> {ARGUMENT_SEPARATOR} { return new ArgumentSeparator() ; }
<YYINITIAL> {INTEGER} { return new IntegerValue(yytext()) ; }
<YYINITIAL> {FLOAT} { return new DoubleValue(yytext()) ; }
<YYINITIAL> {CELL_REFERENCE} { return new CellReference(yytext()) ; }
<YYINITIAL> {CELL_RANGE_3D} { return new Area3d(yytext(),externalSheet) ; }
<YYINITIAL> {CELL_RANGE} { return new Area(yytext()) ; }
<YYINITIAL> {COLUMN_RANGE} { return new ColumnRange(yytext()); }
<YYINITIAL> {CELL_REFERENCE_3D} 
             {return new CellReference3d(yytext(),externalSheet) ; }
<YYINITIAL> {CELL_REFERENCE_3D2} 
             {return new CellReference3d(yytext(),externalSheet) ; }
<YYINITIAL> {COLUMN_RANGE_3D} 
             { return new ColumnRange3d(yytext(),externalSheet) ; }
<YYINITIAL> {BOOLEAN_TRUE} {return new BooleanValue(yytext());}
<YYINITIAL> {BOOLEAN_FALSE} {return new BooleanValue(yytext());}
<YYINITIAL> {NAME} {return new NameRange(yytext(), nameTable); }
<YYINITIAL> {WHITE_SPACE} {}
<YYINITIAL> {OPEN_PARENTHESES} { return new OpenParentheses() ;}
<YYINITIAL> {CLOSE_PARENTHESES} { return new CloseParentheses() ;}
<YYINITIAL> {START_FUNCTION} { return new StringFunction(yytext()) ; }
<YYINITIAL> {RANGE_SEPARATOR} { return new RangeSeparator(); }
<YYINITIAL> {ERROR_CONSTANT} {return new ErrorConstant(yytext());}

<YYINITIAL> {QUOTE} {emptyString = true; yybegin(YYSTRING);}

<YYSTRING>  {STRING} {emptyString = false; return new StringValue(yytext()) ; }
<YYSTRING>  {QUOTE} {yybegin(YYINITIAL); if (emptyString) return new StringValue("");}

=======
/*********************************************************************
*
*      Copyright (C) 2002 Andrew Khan
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 2.1 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
***************************************************************************/

package jxl.biff.formula;

/**
 * This file is generated by JLex.  Do not alter the contents of this file
 * because changes will be overridden
 */

import jxl.biff.WorkbookMethods;

%%

%{
  int getPos() { return yychar ; }
%}

%{
  private boolean emptyString;
%}

%{
  private ExternalSheet externalSheet;
  private WorkbookMethods nameTable;

  void setExternalSheet(ExternalSheet es)
  {
    externalSheet = es;
  }

  void setNameTable(WorkbookMethods nt)
  {
    nameTable = nt;
  }
%}

%yylexthrow{
 jxl.biff.formula.FormulaException
%yylexthrow}

%line
%char
%unicode
%type ParseItem
%state YYSTRING

ALPHA=[A-Za-z]
DIGIT=[0-9]
SYMBOL=[$!%^&*#_=+;#~@/?.,<>|:-\[\]\\]
RANGE_SEPARATOR=":"
ARGUMENT_SEPARATOR=","
OPEN_PARENTHESES="("
CLOSE_PARENTHESES=")"
INTEGER={DIGIT}+
FLOAT={DIGIT}+"."{DIGIT}+
NON_RELATIVE_CELL_IND="$"
BOOLEAN_TRUE="TRUE"
BOOLEAN_FALSE="FALSE"
QUOTE="\""
STRING=[^{QUOTE}]*
SINGLE_QUOTE="'"
CELL_REFERENCE={NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?{NON_RELATIVE_CELL_IND}?{INTEGER}
CELL_RANGE={CELL_REFERENCE}{RANGE_SEPARATOR}{CELL_REFERENCE}
SHEET_NAME={SINGLE_QUOTE}[^{SINGLE_QUOTE}]*{SINGLE_QUOTE}
COLUMN_RANGE={NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?{RANGE_SEPARATOR}{NON_RELATIVE_CELL_IND}?{ALPHA}{ALPHA}?
CELL_RANGE_3D={CELL_REFERENCE_3D}:{CELL_REFERENCE}
CELL_REFERENCE_3D={SHEET_NAME}!{CELL_REFERENCE}
CELL_REFERENCE_3D2=({ALPHA})+!{CELL_REFERENCE}
COLUMN_RANGE_3D={SHEET_NAME}!{COLUMN_RANGE}
NAME={ALPHA}({ALPHA}|{INTEGER}|_)*
WHITE_SPACE=[\n\ \t\b\012]
START_FUNCTION={ALPHA}+{OPEN_PARENTHESES}
ARG_LIST={NAME}
ARG={ALPHA}{ALPHA}({ALPHA}|{INTEGER})*
FUNCTION={START_FUNCTION}{ARG_LIST}?{CLOSE_PARENTHESES}
ERROR_CONSTANT="#NULL!"|"#DIV/0!"|"#VALUE!"|"#REF!"|"#NAME?"|"#NUM!"
%% 

<YYINITIAL> "+"  { return new Plus() ;}
<YYINITIAL> "-"  { return new Minus() ; }
<YYINITIAL> "*"  { return new Multiply() ; }
<YYINITIAL> "/"  { return new Divide() ; }
<YYINITIAL> ">"  { return new GreaterThan() ; }
<YYINITIAL> "="  { return new Equal() ; }
<YYINITIAL> ">=" { return new GreaterEqual() ; }
<YYINITIAL> "<"  { return new LessThan() ; }
<YYINITIAL> "<>" { return new NotEqual() ; }
<YYINITIAL> "<=" { return new LessEqual() ; }
<YYINITIAL> {ARGUMENT_SEPARATOR} { return new ArgumentSeparator() ; }
<YYINITIAL> {INTEGER} { return new IntegerValue(yytext()) ; }
<YYINITIAL> {FLOAT} { return new DoubleValue(yytext()) ; }
<YYINITIAL> {CELL_REFERENCE} { return new CellReference(yytext()) ; }
<YYINITIAL> {CELL_RANGE_3D} { return new Area3d(yytext(),externalSheet) ; }
<YYINITIAL> {CELL_RANGE} { return new Area(yytext()) ; }
<YYINITIAL> {COLUMN_RANGE} { return new ColumnRange(yytext()); }
<YYINITIAL> {CELL_REFERENCE_3D} 
             {return new CellReference3d(yytext(),externalSheet) ; }
<YYINITIAL> {CELL_REFERENCE_3D2} 
             {return new CellReference3d(yytext(),externalSheet) ; }
<YYINITIAL> {COLUMN_RANGE_3D} 
             { return new ColumnRange3d(yytext(),externalSheet) ; }
<YYINITIAL> {BOOLEAN_TRUE} {return new BooleanValue(yytext());}
<YYINITIAL> {BOOLEAN_FALSE} {return new BooleanValue(yytext());}
<YYINITIAL> {NAME} {return new NameRange(yytext(), nameTable); }
<YYINITIAL> {WHITE_SPACE} {}
<YYINITIAL> {OPEN_PARENTHESES} { return new OpenParentheses() ;}
<YYINITIAL> {CLOSE_PARENTHESES} { return new CloseParentheses() ;}
<YYINITIAL> {START_FUNCTION} { return new StringFunction(yytext()) ; }
<YYINITIAL> {RANGE_SEPARATOR} { return new RangeSeparator(); }
<YYINITIAL> {ERROR_CONSTANT} {return new ErrorConstant(yytext());}

<YYINITIAL> {QUOTE} {emptyString = true; yybegin(YYSTRING);}

<YYSTRING>  {STRING} {emptyString = false; return new StringValue(yytext()) ; }
<YYSTRING>  {QUOTE} {yybegin(YYINITIAL); if (emptyString) return new StringValue("");}

>>>>>>> fde20ebac22a557ad28f9148d0a3ed8a02c3ecf8
