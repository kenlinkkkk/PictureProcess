/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Image.Grey;
import GUI.timnguongtudong;
import java.io.IOException;
import static Image.Grey.height;
import static Image.Grey.width;
import static Image.Grey.imgMatrix;
/**
 *
 * @author Kenlink
 */
public class nguongtudong {
    Grey gr = new Grey();
    timnguongtudong ntd = new timnguongtudong();
    
    public nguongtudong() {
    }
    
    public void xuly() throws IOException{
        gr.grey(ntd.fPath);
        
        float[] mang1 = new float[256];
        float[] mang2 = new float[256];
        float[] mang3 = new float[256];
        float[] mang4 = new float[256];
        int x = 0;
        int y = 0;
        while (x < 256) {   
            int dem  = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (imgMatrix[i][j] == x) {
                        dem++;
                    }
                }
            }
            mang1[x] = dem;
            y += mang1[x];
            mang2[x] = y;
            mang3[x] = mang1[x]*mang2[x];
            x++;
        }
//        float s = 0;
//        for (int i = 0; i < 256; i++) {
//            s += (mang3[x]/mang2[x]);
//            mang4[i] = s;
//        }
//        float[] mang5 = new float[256];
//        for (int i = 0; i < 255; i++) {
//            mang5[i] =(((mang2[i])/((height*width) - mang2[i]))*(mang4[i]-mang4[256])*(mang4[i]-mang4[256]));
//        }
        
        System.out.println(timmax(mang3));
        System.out.println(timmax(mang2));
    }
    
    public float timmax(float[] a){
        float max = a[0];
        for (int i = 0; i < 256; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}
