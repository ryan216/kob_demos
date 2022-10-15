//package com.kob.backend.Game;
//
//import com.kob.backend.consumer.utils.Cell;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
///**
// * @Author: 你与黎明
// * @Description: 输赢判断逻辑测试
// * @create: 2022-10-14 13:21
// * @Version: 1.0
// */
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class JudgeTest {
//    private boolean check_valid(List<Cell> cellsA, List<Cell> cellsB) {
//        int n = cellsA.size();
//        Cell cell = cellsA.get(n - 1);
//        if (g[cell.x][cell.y] == 1) return false;
//
//        for (int i = 0; i < n - 1; i ++ ) {
//            if (cellsA.get(i).x == cell.x && cellsA.get(i).y == cell.y)
//                return false;
//        }
//        for (int i = 0; i < n - 1; i ++ ) {
//            if (cellsB.get(i).x == cell.x && cellsB.get(i).y == cell.y)
//                return false;
//        }
//        return true;
//    }
//    private void judge() {  // 判断两名玩家下一步操作是否合法
//        List<Cell> cellsA = playerA.getCells();
//        List<Cell> cellsB = playerB.getCells();
//        boolean validA = check_valid(cellsA, cellsB);
//        boolean validB = check_valid(cellsB, cellsA);
//        if (!validA || !validB) {
//            status = "finished";
//
//            if (!validA && !validB) {
//                loser = "all";
//            } else if (!validA) {
//                loser = "A";
//            } else {
//                loser = "B";
//            }
//        }
//    }
//}
