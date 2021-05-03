package Bai_4_Class_OOP.Thuc_hanh;

public class LopHinhchunhat {

        private double chieuDai;
        private double chieuRong;
        public LopHinhchunhat() {
        }
        public double getchieuDai () {
            return chieuDai;
        }

        public void setchieuDai ( double chieuDai){
            this.chieuDai = chieuDai;
        }

        public double getchieuRong () {
            return chieuRong;
        }

        public void setchieuRong ( double chieuRong){
            this.chieuRong = chieuRong;
        }

        public double dienTich () {
            double dienTich = this.chieuRong * this.chieuDai;
            return dienTich;
        }
        public double chuVi(){
            double chuVi = (this.chieuRong + this.chieuDai)*2;
            return chuVi;
        }
    }

