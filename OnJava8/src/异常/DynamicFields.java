package 异常;
class DynamicFieldsException extends Exception {}
public class DynamicFields {
	private Object[][] fields;//二维数组
	//构造器初始化fields 数据
	public DynamicFields(int init) {
		fields= new Object[init][2];//引用---两列数据
		for(int i =0;i<init;i++) {
			fields[i] = new Object[] {null,null};
		}
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Object [] obj:fields) {
			result.append(obj[0]);
			result.append(":");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	
	
	private int hasField(String id) {
		for(int i=0;i<fields.length;i++) {
			if(id.equals(fields[i][0])) {
				return i;
			}
		}
		return -1;
		
	}
	private int getFieldNumber(String id)
            throws NoSuchFieldException {
		//cause
        int fieldNum = hasField(id);
        if(fieldNum == -1)
            throw new NoSuchFieldException();
        return fieldNum;
    }
	private int makeField(String id) {
		
		for(int i=0;i<fields.length;i++) {
			if(fields[i][0]==null) {
				fields[i][0] = id;
				return i;
			}
		}
		Object [][] temp =  new Object[fields.length+1][2];//temp大小
		for(int i =0;i<fields.length;i++) {
			temp[i] = fields[i];//行
		}
		//列
		for(int i =0;i<temp.length;i++) {
			temp[i] = new Object[] {null,null};
		}
		fields =temp;//引用
		//递归调用
		return makeField(id);
	}
	
	public Object getField(String id ) throws NoSuchFieldException{
		return fields[getFieldNumber(id)][1];
	}
	public Object setField(String id ,Object value)throws DynamicFieldsException {
		if(value==null) {
			DynamicFieldsException dfe =
                    new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
		}
		int fieldNumber = hasField(id);//如果存在就不扩容数组
		if(fieldNumber == -1)
            fieldNumber = makeField(id);
        Object result = null;
        try {
            result = getField(id); // Get old value
        } catch(NoSuchFieldException e) {
// Use constructor that takes "cause":
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
	}
	
	public static void main(String[] args) {
		
	}
	
}
