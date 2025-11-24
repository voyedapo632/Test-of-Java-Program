class Vector4 {
    float x, y, z, w;
    
    public Vector4(float _x, float _y, float _z, float _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }
}

class Matrix4x4 {
    Vector4 x, y, z, w;

    public Matrix4x4(Vector4 _x, Vector4 _y, Vector4 _z, Vector4 _w) {
        x = _x;
        y = _y;
        z = _z;
        w = _w;
    }
}

public class Program {
    public static void main(String[] args) {
        Matrix4x4 mat4x4 = new Matrix4x4(new Vector4(1.0f, 0.0f, 0.0f, 0.5f),
                                         new Vector4(0.0f, 1.0f, 0.0f, 0.0f),
                                         new Vector4(0.0f, 0.0f, 1.0f, 0.0f),
                                         new Vector4(0.0f, 0.0f, 0.0f, 1.0f));

        System.out.println("Hello, World!");
    }
}