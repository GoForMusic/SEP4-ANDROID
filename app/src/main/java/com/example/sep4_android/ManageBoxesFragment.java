package com.example.sep4_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.sep4_android.databinding.ActivityManageBinding;
import com.example.sep4_android.entities.Box;

import java.util.ArrayList;

//Manage Box
public class ManageBoxesFragment extends Fragment {


    private ActivityManageBinding binding;
    private RecyclerView boxList;
    private BoxAdapter boxAdapter;

    Button addButton;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = ActivityManageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //Todo: BOXES
        View v = inflater.inflate(R.layout.activity_manage,container,false);
        boxList = v.findViewById(R.id.recycler_view);
        boxList.hasFixedSize();
        boxList.setLayoutManager(new LinearLayoutManager(getActivity ()));

        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box("Box 1", "111", true, true, " 23"));
        boxes.add(new Box("Box 2", "111", true, true, " 23"));
        boxes.add(new Box("Box 3", "111", true, true, " 23"));

        boxAdapter = new BoxAdapter(boxes);

        boxAdapter.setOnClickListener(box -> {
            Toast.makeText(getActivity(), box.getId(), Toast.LENGTH_SHORT).show();
        });

        boxList.setAdapter(boxAdapter);

        return binding.getRoot();





    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ManageBoxesFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void addBox()
    {

    }

}