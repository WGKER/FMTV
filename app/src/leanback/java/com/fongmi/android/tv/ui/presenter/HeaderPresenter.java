package com.fongmi.android.tv.ui.presenter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.leanback.widget.Presenter;

import com.fongmi.android.tv.databinding.AdapterHeaderBinding;
import com.fongmi.android.tv.utils.ResUtil;

public class HeaderPresenter extends Presenter {

    @NonNull
    @Override
    public Presenter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent) {
        return new HeaderPresenter.ViewHolder(AdapterHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Presenter.ViewHolder viewHolder, Object object) {
        HeaderPresenter.ViewHolder holder = (HeaderPresenter.ViewHolder) viewHolder;
        // 强制固定文字，忽略上层传进来的值，永远显示 TVBOX
        holder.binding.text.setText("TVBOX");
    }

    @Override
    public void onUnbindViewHolder(@NonNull Presenter.ViewHolder viewHolder) {
    }

    public static class ViewHolder extends Presenter.ViewHolder {

        private final AdapterHeaderBinding binding;

        public ViewHolder(@NonNull AdapterHeaderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
