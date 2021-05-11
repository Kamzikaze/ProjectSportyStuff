package windowBuilderStuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerClass implements ActionListener {

	public ActionListenerClass() {

	}

	public void actionPerformed(ActionEvent e) {

		switch (DirtyGlobalVariables.currStatus) {
		case LOGINSIGNUPlogin: {

		}
		case LOGINSIGNUPsignup: {

		}
		case SIGNUPnext: {

		}
		case SIGNUPcancel: {

		}
		case USERADDEDregisterresult: {

		}
		case USERADDEDexit: {

		}
		case LOGINlogin: {

		}
		case LOGINcancel: {

		}
		case RESULTsave: {

		}
		case RESULTcancel: {

		}

		default:
			break;
		}

	}
}
