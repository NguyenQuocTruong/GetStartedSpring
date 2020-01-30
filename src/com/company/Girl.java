package com.company;

public class Girl {
    private Outfit outfit;

    // Hàm tạo này mặc định khi tạo một Girl sẽ tạo ra mội đối tượng Girl mặc quần Jean
    // => Jean  bị phụ thuộc vào hàm tạo này
    public Girl(){
        outfit = new Jean();
    }

    //Hàm tạo giúp giảm sự phụ thuộc của Jean vào Girl
    // Có thể chuyền bất cứ bộ đồ nào vào cho Girl mặc.
    public Girl(Outfit anything){
        this.outfit = anything;
    }
}
