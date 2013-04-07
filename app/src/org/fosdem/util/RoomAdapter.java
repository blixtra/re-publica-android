package org.fosdem.util;

import java.util.ArrayList;

import org.fosdem.pojo.Room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/**
 * @author Christophe Vandeplas <christophe@vandeplas.com>
 * @author Chris Kühl <chris@endocode.com>
 *
 */
public class RoomAdapter extends ArrayAdapter<Room> implements SpinnerAdapter {

	private int layoutResourceId;
	private int textViewResourceId;
	private ArrayList<Room> items;
	private int dropDownResourceId;

	public RoomAdapter(Context context, int layoutResourceId, int textViewResourceId, ArrayList<Room> items) {
		super(context, layoutResourceId, textViewResourceId, items);
		this.layoutResourceId = layoutResourceId;
		this.dropDownResourceId = layoutResourceId;
		this.textViewResourceId = textViewResourceId;
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			v = LayoutInflater.from(getContext()).inflate(layoutResourceId, null);
		}

		Room room = items.get(position);
		if (room != null) {
			TextView title = (TextView) v.findViewById(textViewResourceId);
			title.setText(room.getName());
		}

		return v;
	}

	/**
	 * Sets the layout resource to create the drop down views.
	 */
	public void setDropDownViewResource(int resource) {
		this.dropDownResourceId = resource;
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		// returns a dropdown view if used as SpinnerAdapter
		View v = convertView;
		if (v == null) {
			v = LayoutInflater.from(getContext()).inflate(dropDownResourceId, null);
		}

		Room room = items.get(position);
		if (room != null) {
			TextView title = (TextView) v.findViewById(textViewResourceId);
			title.setText(room.getName());
		}

		return v;
	}

	public Integer getPositionOfTrack(String roomName) {
		int i = 0;

		for (Room room : items) {
			if (roomName.equals(room.getName())) {
				return i;
			}
			i++;
		}

		return null;
	}

}
