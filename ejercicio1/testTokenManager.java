/* Generated By:JavaCC: Do not edit this line. testTokenManager.java */

/** Token Manager. */
public class testTokenManager implements testConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xc000000000L) != 0L)
            return 2;
         if ((active0 & 0x7f000001fffeL) != 0L)
         {
            jjmatchedKind = 48;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x10000000380L) != 0L)
            return 2;
         if ((active0 & 0x7e000001fc7eL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 48;
               jjmatchedPos = 1;
            }
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x100000000000L) != 0L)
            return 2;
         if ((active0 & 0x6e000001fcfeL) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x10862L) != 0L)
            return 2;
         if ((active0 & 0x6e000000f49cL) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x24000000a000L) != 0L)
            return 2;
         if ((active0 & 0x4a000000549cL) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x4a0000000400L) != 0L)
            return 2;
         if ((active0 & 0x509cL) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      case 6:
         if ((active0 & 0x5010L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 6;
            return 2;
         }
         if ((active0 & 0x8cL) != 0L)
            return 2;
         return -1;
      case 7:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 7;
            return 2;
         }
         if ((active0 & 0x4010L) != 0L)
            return 2;
         return -1;
      case 8:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 8;
            return 2;
         }
         return -1;
      case 9:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 9;
            return 2;
         }
         return -1;
      case 10:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 10;
            return 2;
         }
         return -1;
      case 11:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 11;
            return 2;
         }
         return -1;
      case 12:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 12;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 34:
         return jjStopAtPos(0, 24);
      case 35:
         return jjStopAtPos(0, 21);
      case 37:
         return jjStopAtPos(0, 27);
      case 38:
         return jjStopAtPos(0, 28);
      case 40:
         return jjStopAtPos(0, 17);
      case 41:
         return jjStopAtPos(0, 18);
      case 43:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 44:
         return jjStopAtPos(0, 25);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 46:
         return jjStopAtPos(0, 26);
      case 58:
         return jjStopAtPos(0, 23);
      case 59:
         return jjStopAtPos(0, 22);
      case 60:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x400000000L);
      case 61:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 62:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x100000000004L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x440aL);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 111:
         return jjStartNfaWithStates_0(0, 39, 2);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x11000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x400000000380L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 121:
         return jjStartNfaWithStates_0(0, 38, 2);
      case 123:
         return jjStopAtPos(0, 19);
      case 125:
         return jjStopAtPos(0, 20);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 43:
         if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(1, 30);
         break;
      case 45:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         break;
      case 61:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000001a802L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x458L);
      case 105:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x4280L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x120000000004L);
      case 111:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 40, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000020L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x8004L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x5040L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x22L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x408L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000010000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x880L);
      case 116:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 100:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0xa0000008000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000002000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000004L);
      case 110:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x4200L);
      case 111:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 2);
         break;
      case 114:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8L);
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x1090L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x480000000000L);
      case 111:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         break;
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 2);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 45, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x4L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 43, 2);
         break;
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x4L);
      case 103:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 46, 2);
         break;
      case 105:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 2);
         break;
      case 106:
         return jjMoveStringLiteralDfa6_0(active0, 0x8L);
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 111:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 41, 2);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(6, 7, 2);
         return jjMoveStringLiteralDfa7_0(active0, 0x4010L);
      case 101:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(6, 2, 2);
         else if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(6, 3, 2);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(7, 4, 2);
         return jjMoveStringLiteralDfa8_0(active0, 0x1000L);
      case 115:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa13_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(13, 12, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0x0L, 0x408220200000000L
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjCheckNAdd(2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 48)
                     kind = 48;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\155\141\151\156", "\151\156\143\154\165\144\145", 
"\155\145\156\163\141\152\145", "\162\145\147\162\145\163\141\162", "\166\157\151\144", "\154\145\145\162", 
"\163\151\163\164\145\155\141", "\163\151", "\163\151\40\156\157", "\155\145\156\165\163\151", 
"\143\141\163\157", "\160\162\145\144\145\164\145\162\155\151\156\141\144\157", 
"\123\141\154\151\162", "\155\151\145\156\164\162\141\163", "\150\141\143\145\162", 
"\160\141\162\141", "\50", "\51", "\173", "\175", "\43", "\73", "\72", "\42", "\54", "\56", "\45", 
"\46", "\75", "\53\53", "\55\55", "\74", "\76", "\74\75", "\76\75", "\75\75", 
"\41\75", "\171", "\157", "\156\157", "\145\156\164\145\162\157", 
"\144\157\142\154\145", "\143\141\144\145\156\141", "\151\156\164", "\146\154\157\141\164", 
"\163\164\162\151\156\147", null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffffffffL, 
};
static final long[] jjtoSkip = {
   0x3e000000000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[3];
static private final int[] jjstateSet = new int[6];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public testTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public testTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                      System.out.println("MAIN -> "+image);
         break;
      case 2 :
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                         System.out.println("INCLUIR -> "+image);
         break;
      case 3 :
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                         System.out.println("MENSAJE -> "+image);
         break;
      case 4 :
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                         System.out.println("REGRESAR -> "+image);
         break;
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                   System.out.println("VOID -> "+image);
         break;
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                   System.out.println("LEER -> "+image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                          System.out.println("SISTEMA -> "+image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
               System.out.println("IF -> "+image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                    System.out.println("ELSE -> "+image);
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                       System.out.println("MENUSI -> "+image);
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                   System.out.println("CASO -> "+image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                                       System.out.println("PREDETERMINADO -> "+image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                     System.out.println("SALIR -> "+image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                       System.out.println("MIENTRAS -> "+image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                  System.out.println("HACER -> "+image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                  System.out.println("PARA -> "+image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                         System.out.println("PARENTESISIZQ -> "+image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                         System.out.println("PARENTESISDER -> "+image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                    System.out.println("LLAVEIZQ -> "+image+"\u005cr\u005cn");
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                    System.out.println("LLAVEDER -> "+image+"\u005cr\u005cn");
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                   System.out.println("NUMERAL -> "+image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                      System.out.println("PUNTOYCOMA -> "+image+"\u005cr\u005cn");
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                     System.out.println("DOSPUNTOS -> "+image);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                       System.out.println("COMILLADOBLE -> "+image);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                System.out.println("COMA -> "+image);
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                 System.out.println("PUNTO -> "+image);
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                      System.out.println("PORCENTAJE -> "+image);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                     System.out.println("AMPERSAND -> "+image);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                       System.out.println("ASIGNACION -> "+image);
         break;
      case 30 :
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                      System.out.println("INCREMENTO -> "+image);
         break;
      case 31 :
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                        System.out.println("DECREMENTO -> "+image);
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                 System.out.println("MENORQUE -> "+image);
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                  System.out.println("MAYORQUE -> "+image);
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
                        System.out.println("MENOROIGUALQUE -> "+image);
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                        System.out.println("MAYOROIGUALQUE -> "+image);
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                   System.out.println("IGUAL -> "+image);
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                      System.out.println("DISTINTO -> "+image);
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
               System.out.println("OPERADOR_Y -> "+image);
         break;
      case 39 :
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
              System.out.println("OPERADOR_O -> "+image);
         break;
      case 40 :
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                System.out.println("OPERADOR_NO -> "+image);
         break;
      case 41 :
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                        System.out.println("ENTERO ->"+image);
         break;
      case 42 :
        image.append(jjstrLiteralImages[42]);
        lengthOfMatch = jjstrLiteralImages[42].length();
                      System.out.println("DOBLE -> "+image);
         break;
      case 43 :
        image.append(jjstrLiteralImages[43]);
        lengthOfMatch = jjstrLiteralImages[43].length();
                        System.out.println("CADENA -> "+image);
         break;
      case 44 :
        image.append(jjstrLiteralImages[44]);
        lengthOfMatch = jjstrLiteralImages[44].length();
                  System.out.println("TYPEINT ->"+image);
         break;
      case 45 :
        image.append(jjstrLiteralImages[45]);
        lengthOfMatch = jjstrLiteralImages[45].length();
                      System.out.println("TYPEFLOAT ->"+image);
         break;
      case 46 :
        image.append(jjstrLiteralImages[46]);
        lengthOfMatch = jjstrLiteralImages[46].length();
                        System.out.println("TYPESTRING ->"+image);
         break;
      case 47 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                           System.out.println("NUMERO -> "+image);
         break;
      case 48 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                                        System.out.println("IDENTIFICADOR -> "+image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
