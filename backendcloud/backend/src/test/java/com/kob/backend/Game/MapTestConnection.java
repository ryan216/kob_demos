//package com.kob.backend.Game;
//
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Random;
//
///**
// * @Author: 你与黎明
// * @Description: 地图测试连通性
// * @create: 2022-10-14 13:24
// * @Version: 1.0
// */
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class MapTestConnection {
//
//    private boolean check_connectivity(int sx, int sy, int tx, int ty) {
//        if (sx == tx && sy == ty) return true;
//        g[sx][sy] = 1;
//        for (int i = 0; i < 4; i ++ ) {
//            int x = sx + dx[i], y = sy + dy[i];
//            if (x >= 0 && x < this.rows && y >= 0 && y < this.cols && g[x][y] == 0) {
//                if (check_connectivity(x, y, tx, ty)) {
//                    g[sx][sy] = 0;
//                    return true;
//                }
//            }
//        }
//        g[sx][sy] = 0;
//        return false;
//    }
//
//    private boolean draw() {  // 画地图
//        for (int i = 0; i < this.rows; i ++ ) {
//            for (int j = 0; j < this.cols; j ++ ) {
//                g[i][j] = 0;
//            }
//        }
//        for (int r = 0; r < this.rows; r ++ ) {
//            g[r][0] = g[r][this.cols - 1] = 1;
//        }
//        for (int c = 0; c < this.cols; c ++ ) {
//            g[0][c] = g[this.rows - 1][c] = 1;
//        }
//
//        Random random = new Random();
//        for (int i = 0; i < this.inner_walls_count / 2; i ++ ) {
//            for (int j = 0; j < 1000; j ++ ) {
//                int r = random.nextInt(this.rows);
//                int c = random.nextInt(this.cols);
//                if (g[r][c] == 1 || g[this.rows - 1 - r][this.cols - 1 - c] == 1)
//                    continue;
//                if (r == this.rows - 2 && c == 1 || r == 1 && c == this.cols - 2)
//                    continue;
//                g[r][c] = g[this.rows - 1 - r][this.cols - 1 - c] = 1;
//                break;
//            }
//        }
//        return check_connectivity(this.rows - 2, 1, 1, this.cols - 2);
//    }
//}
