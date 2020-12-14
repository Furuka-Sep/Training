public class Mouse implements UsbConnectable{
	@Override//Overrideする場合アクセス修飾子は同じかそれより効力の弱い物しか扱えない
	public void usbConnect(){
		System.out.println("USB接続にてマウス操作ができます");
	}
}
