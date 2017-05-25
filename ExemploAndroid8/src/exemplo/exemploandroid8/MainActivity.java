package exemplo.exemploandroid8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends Activity
{
	private RadioGroup radioSexGroup;
	private RadioButton radioSexButton;
	private Button btnDisplay;
	private String cpf,nome,idade,sexo;
	private CheckBox chkStar,chkGame,chkSenhor;
	private Intent intent;
	private EditText editCpf, editNome, editIdade;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		editCpf = (EditText) findViewById(R.id.txtCpf);
		editNome = (EditText)findViewById(R.id.txtNome);
		editIdade = (EditText)findViewById(R.id.txtIdade);
		radioSexGroup = (RadioGroup)findViewById(R.id.radioGroup1);
		btnDisplay = (Button)findViewById(R.id.btnDisplay);
		chkStar = (CheckBox)findViewById(R.id.chkStar);
		chkSenhor = (CheckBox)findViewById(R.id.chkSenhor);
		chkGame=(CheckBox)findViewById(R.id.chkGame);
		
		btnDisplay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
				radioSexButton = (RadioButton)findViewById(selectedId);
				
			}
		});
	}
}
